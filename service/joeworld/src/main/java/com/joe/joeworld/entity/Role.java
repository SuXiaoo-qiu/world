package com.joe.joeworld.entity;


public class Role {


	/** 角色id */
	private String id;
	/** 角色名称 */
	private String roleName;
	/** 角色编码 */
	private String roleCode;
	/** 备注 */
	private String remark;
	/** 是否删除 00已删除， 10未删除 */
	private Byte isDeleted;
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

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Byte getIsDeleted() {
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
        Role that = (Role) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Role{" +
				"id=" + id +
						",roleName='" + roleName + "'" +
						",roleCode='" + roleCode + "'" +
						",remark='" + remark + "'" +
						",isDeleted='" + isDeleted + "'" +
						",gmtCreate='" + gmtCreate + "'" +
						",gmtModified='" + gmtModified + "'" +
						",createPeople='" + createPeople + "'" +
						",updatePeople='" + updatePeople + "'" +
		                '}';
    }

}
