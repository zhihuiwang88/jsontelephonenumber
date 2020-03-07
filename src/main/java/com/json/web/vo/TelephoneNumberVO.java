package com.json.web.vo;

import java.io.Serializable;

public class TelephoneNumberVO<T> implements Serializable{

	/**
	 * 请求参数封装成对象
	 */
	private static final long serialVersionUID = -4416311397852931144L;

	
	private String reason;
	private Integer error_code;
	private T result;
	
	
	@Override
	public String toString() {
		return "TelephoneNumberVO [reason=" + reason + ", error_code=" + error_code + ", result=" + result + "]";
	}
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getError_code() {
		return error_code;
	}
	public void setError_code(Integer error_code) {
		this.error_code = error_code;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	
}
