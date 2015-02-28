package com.rails.common.exception;

import java.io.Serializable;

/**
 * Class Name: BusinessExceptionMessage.java Function: * Modifications: * @author
 * * huangww DateTime 2015-1-7 下午7:14:14
 * 
 * @version 1.0 *
 */
public class BusinessExceptionMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code; // 编码

    private String message; // 信息

    public BusinessExceptionMessage(String code, String message) {
	super();
	this.code = code;
	this.message = message;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public String getCode() {
	return code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    public String toString() {
	return "code:" + code + " message:" + message;
    }

}
