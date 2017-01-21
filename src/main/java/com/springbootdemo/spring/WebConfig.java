/**
 *
 */
package com.springbootdemo.spring;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author RamS
 *
 */
@Configuration
@ComponentScan({ "com.springbootdemo.web" })
@EnableWebMvc
@EnableSwagger2
public class WebConfig extends WebMvcConfigurerAdapter {

    public WebConfig() {
        super();
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        Optional<HttpMessageConverter<?>> converterfound = converters.stream().filter(c -> c instanceof AbstractJackson2HttpMessageConverter).findFirst();
        if (converterfound.isPresent()) {
            AbstractJackson2HttpMessageConverter converter = (AbstractJackson2HttpMessageConverter) converterfound.get();
            converter.getObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            converter.getObjectMapper().enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        }
        final Optional<HttpMessageConverter<?>> xmlConverterFound = converters.stream().filter(c -> c instanceof MappingJackson2XmlHttpMessageConverter).findFirst();
        if (xmlConverterFound.isPresent()) {
            final MappingJackson2XmlHttpMessageConverter converter = (MappingJackson2XmlHttpMessageConverter) xmlConverterFound.get();
            converter.getObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            converter.getObjectMapper().enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        }
    }

    @Bean
    public Docket api() {
        //@formatter:off
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build()
                .directModelSubstitute(LocalDate.class, String.class)
                .genericModelSubstitutes(ResponseEntity.class);
      //@formatter:on
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
