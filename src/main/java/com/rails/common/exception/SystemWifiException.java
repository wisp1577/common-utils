package com.rails.common.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Name: SystemWifiException.java Function: 系统异常处理类 * Modifications: * @author
 * huangww DateTime 2015-1-7 下午7:18:29
 * 
 * @version 1.0 *
 */
public class SystemWifiException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    List<BusinessExceptionMessage> businessExceptionMessageList = null;

    public SystemWifiException(
	    List<BusinessExceptionMessage> businessExceptionMessageList) {
	this.businessExceptionMessageList = businessExceptionMessageList;
    }

    public SystemWifiException(String code, String message) {
	this.businessExceptionMessageList = new ArrayList<BusinessExceptionMessage>();
	BusinessExceptionMessage businessExceptionMessage = new BusinessExceptionMessage(
		code, message);
	businessExceptionMessageList.add(businessExceptionMessage);
    }

    /**
     * 构造方法：code默认为空
     * 
     * @param message
     */
    public SystemWifiException(String message) {    	
	this.businessExceptionMessageList = new ArrayList<BusinessExceptionMessage>();
	BusinessExceptionMessage businessExceptionMessage = new BusinessExceptionMessage(
		"", message);
	businessExceptionMessageList.add(businessExceptionMessage);
    }

    public SystemWifiException(Throwable e) {
	super(e);
	this.businessExceptionMessageList = new ArrayList<BusinessExceptionMessage>();
	BusinessExceptionMessage businessExceptionMessage = new BusinessExceptionMessage(
		"", e.getMessage());
	businessExceptionMessageList.add(businessExceptionMessage);
    }

    public SystemWifiException(Throwable e, String code) {
	super(e);
	this.businessExceptionMessageList = new ArrayList<BusinessExceptionMessage>();
	BusinessExceptionMessage businessExceptionMessage = new BusinessExceptionMessage(
		code, e.getMessage());
	businessExceptionMessageList.add(businessExceptionMessage);
    }

    public List<BusinessExceptionMessage> getBusinessExceptionMessageList() {
	return businessExceptionMessageList;
    }

    public BusinessExceptionMessage getBusinessExceptionMessage() {
	if (businessExceptionMessageList != null
		&& businessExceptionMessageList.size() > 0) {
	    return businessExceptionMessageList.get(0);
	} else {
	    return null;
	}
    }
}
