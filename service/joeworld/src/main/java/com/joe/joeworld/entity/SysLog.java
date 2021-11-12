package com.joe.joeworld.entity;

import java.util.Date;

/**
 * 系统日志
 */
public class SysLog {


	private Long id;
	/** 用户id */
	private Long userId;
	/** 用户名 */
	private String username;
	/** 用户操作 */
	private String operation;
	/** 响应时间 */
	private Integer time;
	/** 请求方法 */
	private String method;
	/** 请求参数 */
	private String params;
	/** IP地址 */
	private String ip;
	/** 创建时间 */
	private Date gmtCreate;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getMethod() {
		return this.method;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getParams() {
		return this.params;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return this.ip;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}


	@Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        SysLog that = (SysLog) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SysLog{" +
				"id=" + id +
						",userId='" + userId + "'" +
						",username='" + username + "'" +
						",operation='" + operation + "'" +
						",time='" + time + "'" +
						",method='" + method + "'" +
						",params='" + params + "'" +
						",ip='" + ip + "'" +
						",gmtCreate='" + gmtCreate + "'" +
		                '}';
    }

}
