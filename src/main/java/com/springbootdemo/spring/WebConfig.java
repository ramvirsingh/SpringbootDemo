/**
 *
 */
package com.springbootdemo.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author RamS
 *
 */
@Configuration
@ComponentScan({ "com.springbootdemo.web" })
@EnableWebMvc
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
    }
}
