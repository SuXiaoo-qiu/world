package com.joe.testonedemo.entity;


/**
 * 用户表
 */
public class User {


	/** 会员id */
	private String id;
	/** 微信openid */
	private String username;
	/** 密码 */
	private String password;
	/** 昵称 */
	private String nickName;
	/** 用户头像 */
	private String salt;
	/** 用户签名 */
	private String token;
	/** 逻辑删除00 已删除，10未删除 */
	private String isDeleted;
	/** 创建时间 */
	private String gmtCreate;
	/** 更新时间 */
	private String gmtModified;
	/** 创建人 */
	private String createPeople;
	/** 修改人 */
	private String updatePeople;

	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getNickName() {
		return this.nickName;
	}
	
	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	public String getSalt() {
		return this.salt;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return this.token;
	}
	
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public String getIsDeleted() {
		return this.isDeleted;
	}
	
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	
	public String getGmtCreate() {
		return this.gmtCreate;
	}
	
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	
	public String getGmtModified() {
		return this.gmtModified;
	}
	
	public void setCreatePeople(String createPeople) {
		this.createPeople = createPeople;
	}
	
	public String getCreatePeople() {
		return this.createPeople;
	}
	
	public void setUpdatePeople(String updatePeople) {
		this.updatePeople = updatePeople;
	}
	
	public String getUpdatePeople() {
		return this.updatePeople;
	}
	

	@Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        User that = (User) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "User{" +
				"id=" + id +
						",username='" + username + "'" + 
						",password='" + password + "'" + 
						",nickName='" + nickName + "'" + 
						",salt='" + salt + "'" + 
						",token='" + token + "'" + 
						",isDeleted='" + isDeleted + "'" + 
						",gmtCreate='" + gmtCreate + "'" + 
						",gmtModified='" + gmtModified + "'" + 
						",createPeople='" + createPeople + "'" + 
						",updatePeople='" + updatePeople + "'" + 
		                '}';
    }
	
}
