package com.joe.joeworld.service;


import com.github.pagehelper.PageInfo;
import com.joe.joeworld.entity.Role;
import org.springframework.cglib.core.ClassInfo;

import java.util.List;
import java.util.Map;

public interface RoleService {

    /**
    *   分页查询所有记录
    * @param map
    * @return
    */
    PageInfo<ClassInfo> findPage(Map<String,Object> map);

	/**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
	List<Role> listAll(Map<String,Object> map);

	/**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
	Role getById(String id);

	/**
     * 新增，插入所有字段
     *
     * @param role 新增的记录
     * @return 返回影响行数
     */
	int insert(Role role);

	/**
     * 新增，忽略null字段
     *
     * @param role 新增的记录
     * @return 返回影响行数
     */
	int insertIgnoreNull(Role role);

	/**
     * 修改，修改所有字段
     *
     * @param role 修改的记录
     * @return 返回影响行数
     */
	int update(Role role);

	/**
     * 修改，忽略null字段
     *
     * @param role 修改的记录
     * @return 返回影响行数
     */
	int updateIgnoreNull(Role role);

	/**
     * 删除记录
     *
     * @param role 待删除的记录
     * @return 返回影响行数
     */
	int delete(Role role);

}
