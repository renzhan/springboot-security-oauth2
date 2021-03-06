package com.springboot.security.base;


public abstract class BaseResponseEntity {

	public BaseResponseEntity() {
		this.code = CommonConstant.ServerApp.SERVER_RET_SUSSCESS;
	}

	/**
	 * 0：成功 1：失败
	 */
	private String code;
	/**
	 * 返回的消息
	 */
	private String msg;

	/**
	 * 成功
	 */
	public void setSuccess() {
		this.code = CommonConstant.ServerApp.SERVER_RET_SUSSCESS;
	}

	/**
	 * 成功
	 * 
	 * @param msg
	 */
	public void setSuccess(String msg) {
		this.code = CommonConstant.ServerApp.SERVER_RET_SUSSCESS;
		this.msg = msg;
	}

	/**
	 * 失败
	 * 
	 * @param msg
	 */
	public void setFailure(String msg) {
		this.code = CommonConstant.ServerApp.SERVER_RET_FAILURE;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
