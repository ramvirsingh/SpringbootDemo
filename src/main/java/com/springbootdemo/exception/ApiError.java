package com.springbootdemo.exception;

public class ApiError {

    private int status;
    private String message;
    private String developerMessage;

    public ApiError() {
        super();
    }

    /**
     * @param status
     * @param message
     * @param developerMessage
     */
    public ApiError(int status, String message, String developerMessage) {
        super();
        this.status = status;
        this.message = message;
        this.developerMessage = developerMessage;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the developerMessage
     */
    public String getDeveloperMessage() {
        return developerMessage;
    }

    /**
     * @param developerMessage the developerMessage to set
     */
    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

}
