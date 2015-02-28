package com.rails.common.exception;

/**
 * 
 * Class Name: ServiceMessageException.java Function:
 * 
 * Modifications:
 * 
 * @author huangww DateTime 2015-1-8 下午9:54:05
 * @version 1.0
 */
public class ServiceMessageException extends RuntimeException {

    private static final long serialVersionUID = -7936621829410590188L;

    private String code;

    public ServiceMessageException() {
	super();
    }

    public ServiceMessageException(String message) {
	super(message);
    }

    public String getCode() {
	return code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    public ServiceMessageException(String message, String code) {
	super(message);
	this.code = code;
    }

}
