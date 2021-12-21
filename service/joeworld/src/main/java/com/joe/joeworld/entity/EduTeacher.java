package com.joe.joeworld.entity;


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
	/** 是否删除 00已删除，10未删除 */
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
	public int hashCode() {
		return java.util.Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Teacher{" +
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
				",createPeople='" + createPeople + "'" +
				",updatePeople='" + updatePeople + "'" +
				'}';
	}

}
