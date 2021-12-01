package com.joe.testonedemo.service;


import com.github.pagehelper.PageInfo;
import com.joe.testonedemo.entity.User;
import org.springframework.cglib.core.ClassInfo;

import java.util.List;
import java.util.Map;

public interface UserService {

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
	List<User> listAll(Map<String,Object> map);

	/**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
	User getById(String id);

	/**
     * 新增，插入所有字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
	int insert(User user);

	/**
     * 新增，忽略null字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
	int insertIgnoreNull(User user);

	/**
     * 修改，修改所有字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
	int update(User user);

	/**
     * 修改，忽略null字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
	int updateIgnoreNull(User user);

	/**
     * 删除记录
     *
     * @param user 待删除的记录
     * @return 返回影响行数
     */
	int delete(User user);

}
