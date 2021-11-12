package com.joe.joeworld.entity;


import java.util.Date;

/**
 * 课程科目
 */
public class Subject {
	/** 课程类别ID */
	private String id;
	/** 类别名称 */
	private String title;
	/** 父ID */
	private String parentId;
	/** 排序字段 */
	private Integer sort;
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

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getSort() {
		return this.sort;
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
        Subject that = (Subject) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Subject{" +
				"id=" + id +
						",title='" + title + "'" +
						",parentId='" + parentId + "'" +
						",sort='" + sort + "'" +
						",gmtCreate='" + gmtCreate + "'" +
						",gmtModified='" + gmtModified + "'" +
		                '}';
    }

}
