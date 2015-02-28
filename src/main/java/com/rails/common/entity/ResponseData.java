package com.rails.common.entity;

import java.io.Serializable;


/**  
 * @ClassName: responseBody   
 * @Description: 返回页面的Json对象
 * @author: "blueSummer"  
 * @date:2014-12-23 上午10:56:06     
 */ 
@SuppressWarnings("serial")
public class ResponseData implements Serializable{
	private String status;	//状态
	private String message;	//消息
	private String savestatus;//保存或者更新的状态
	private Object data;	//数据信息
	private Page page; //分页信息
	
	public static final String SUCCESS = "success";
	public static final String ERROR = "error";
	public static final String WARNING = "warning";
	
	public ResponseData() {
		
	}
	
	public static ResponseData newSuccessResponseData() {
	return new ResponseData(ResponseData.SUCCESS);
	}
	public static ResponseData getErrorResponseData() {
		return new ResponseData(ResponseData.ERROR);
		}
	public static ResponseData getWarningResponseData() {
		return new ResponseData(ResponseData.WARNING);
		}
	
	
	public ResponseData(String status) {
		this.status = status;
	}
	
	public ResponseData(String status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public ResponseData(String status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object obj) {
		this.data = obj;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getSavestatus() {
		return savestatus;
	}

	public void setSavestatus(String savestatus) {
		this.savestatus = savestatus;
	}

}
