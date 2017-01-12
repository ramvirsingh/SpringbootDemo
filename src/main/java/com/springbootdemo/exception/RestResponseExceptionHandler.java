/**
 *
 */
package com.springbootdemo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author RAM
 *
 */
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {

    public RestResponseExceptionHandler() {
        super();
    }

    @Override
    public final ResponseEntity<Object> handleHttpMessageNotReadable(final HttpMessageNotReadableException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        return handleExceptionInternal(ex, "There is issue", headers, HttpStatus.BAD_REQUEST, request);
    }

}
