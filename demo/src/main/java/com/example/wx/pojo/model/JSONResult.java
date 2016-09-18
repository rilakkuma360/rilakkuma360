package com.example.wx.pojo.model;

import java.io.Serializable;

public class JSONResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6279885442001596841L;
	
	private String errcode;
	
	private String errmsg;

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	
	

}
