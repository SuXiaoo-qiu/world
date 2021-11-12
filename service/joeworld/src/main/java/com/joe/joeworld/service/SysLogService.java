package com.joe.joeworld.service;


import com.github.pagehelper.PageInfo;
import com.joe.joeworld.entity.SysLog;
import org.springframework.cglib.core.ClassInfo;

import java.util.List;
import java.util.Map;

public interface SysLogService {

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
	List<SysLog> listAll(Map<String,Object> map);

	/**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
	SysLog getById(Long id);

	/**
     * 新增，插入所有字段
     *
     * @param sysLog 新增的记录
     * @return 返回影响行数
     */
	int insert(SysLog sysLog);

	/**
     * 新增，忽略null字段
     *
     * @param sysLog 新增的记录
     * @return 返回影响行数
     */
	int insertIgnoreNull(SysLog sysLog);

	/**
     * 修改，修改所有字段
     *
     * @param sysLog 修改的记录
     * @return 返回影响行数
     */
	int update(SysLog sysLog);

	/**
     * 修改，忽略null字段
     *
     * @param sysLog 修改的记录
     * @return 返回影响行数
     */
	int updateIgnoreNull(SysLog sysLog);

	/**
     * 删除记录
     *
     * @param sysLog 待删除的记录
     * @return 返回影响行数
     */
	int delete(SysLog sysLog);

}
