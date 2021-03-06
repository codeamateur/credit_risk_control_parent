package com.hanzhou.www.dto;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

public class BaseResult {
	
	protected boolean success = false;
	protected String errorCode;
	protected String errorMsg;
	protected Map<?, ?> map;
	protected String msg;
	protected List<?> list;
	protected PageInfo<?> page;
	
	public Map<?, ?> getMap() {
		return map;
	}
	public void setMap(Map<?, ?> map) {
		this.map = map;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode; 
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public PageInfo<?> getPage() {
		return page;
	}
	public void setPage(PageInfo<?> page) {
		this.page = page;
	}

}