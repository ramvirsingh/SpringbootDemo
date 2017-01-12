/**
 *
 */
package com.springbootdemo.exception;

/**
 * @author RAM
 *
 */
public final class MyEntityNotFoundException extends RuntimeException {

    public MyEntityNotFoundException() {
        super();
    }

    public MyEntityNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public MyEntityNotFoundException(final String message) {
        super(message);
    }

    public MyEntityNotFoundException(final Throwable cause) {
        super(cause);
    }

}