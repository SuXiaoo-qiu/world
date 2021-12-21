package com.joe.joeworld.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.joe.joeworld.dao.RoleMapper;
import com.joe.joeworld.entity.Role;
import com.joe.joeworld.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
    * 分页查询所有记录
    * @param map
    * @return
    */
    @Override
    public PageInfo<ClassInfo> findPage(Map<String, Object> map) {

        PageHelper.startPage(Integer.valueOf(map.get("pageCode").toString()), Integer.valueOf(map.get("pageSize").toString()));
        List<ClassInfo> page = roleMapper.findPage(map);
        return new PageInfo<>(page);
    }


    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<Role> listAll(Map<String,Object> map) {
    	return roleMapper.listAll(map);
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public Role getById(String id) {
    	return roleMapper.getById(id);
    }

    /**
     * 新增，插入所有字段
     *
     * @param role 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insert(Role role) {
    	return roleMapper.insert(role);
    }

    /**
     * 新增，忽略null字段
     *
     * @param role 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(Role role) {
    	return roleMapper.insertIgnoreNull(role);
    }

    /**
     * 修改，修改所有字段
     *
     * @param role 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(Role role) {
    	return roleMapper.update(role);
    }

    /**
     * 修改，忽略null字段
     *
     * @param role 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(Role role) {
    	return roleMapper.updateIgnoreNull(role);
    }

    /**
     * 删除记录
     *
     * @param role 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(Role role) {
    	return roleMapper.delete(role);
    }

}
