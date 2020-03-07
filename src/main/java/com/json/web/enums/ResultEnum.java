package com.json.web.enums;

public enum ResultEnum {

	TELNUM_IS_NULL(100,"Telnum IS NULL"),
	
	;
	
	
	ResultEnum(Integer code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	private Integer code;
	private String msg;
	
	public Integer getCode() {
		return code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	
	
	
	
}
