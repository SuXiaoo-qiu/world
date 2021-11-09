package com.joe.joeworld.entity;


import java.util.Date;

/**
 * 讲师
 */
public class EduTeacher {

	/** 讲师ID */
	private String id;
	/** 讲师姓名 */
	private String name;
	/** 讲师简介 */
	private String intro;
	/** 讲师资历,一句话说明讲师 */
	private String career;
	/** 头衔 1高级讲师 2首席讲师 */
	private Integer level;
	/** 讲师头像 */
	private String avatar;
	/** 排序 */
	private Integer sort;
	/** 逻辑删除 1（true）已删除， 0（false）未删除 */
	private Byte isDeleted;
	/** 创建时间 */
	private Date gmtCreate;
	/** 更新时间 */
	private Date gmtModified;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getCareer() {
		return this.career;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}


	@Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        EduTeacher that = (EduTeacher) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "EduTeacher{" +
				"id=" + id +
						",name='" + name + "'" +
						",intro='" + intro + "'" +
						",career='" + career + "'" +
						",level='" + level + "'" +
						",avatar='" + avatar + "'" +
						",sort='" + sort + "'" +
						",isDeleted='" + isDeleted + "'" +
						",gmtCreate='" + gmtCreate + "'" +
						",gmtModified='" + gmtModified + "'" +
		                '}';
    }

}
