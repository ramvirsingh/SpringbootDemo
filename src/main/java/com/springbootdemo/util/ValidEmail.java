/**
 *
 */
package com.springbootdemo.util;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;

/**
 * The string has to be a well-formed email address.
 * @author RamS
 *
 */
@Documented
@Target({ TYPE, METHOD, PARAMETER, FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Pattern(regexp = Constants.PATTERN, flags = Pattern.Flag.CASE_INSENSITIVE)
public @interface ValidEmail {
    String message() default "Wrong email";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

interface Constants {
    static final String ATOM = "[a-z0-9!#$%&'*+/=?^_`{|}~-]";
    static final String DOMAIN = "(" + ATOM + "+(\\." + ATOM + "+)+";
    static final String IP_DOMAIN = "\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\]";

    static final String PATTERN = "^" + ATOM + "+(\\." + ATOM + "+)*@" + DOMAIN + "|" + IP_DOMAIN + ")$";
}