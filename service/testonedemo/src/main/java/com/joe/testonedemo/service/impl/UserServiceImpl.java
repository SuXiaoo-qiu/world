package com.joe.testonedemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.joe.testonedemo.dao.UserMapper;
import com.joe.testonedemo.entity.User;
import com.joe.testonedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
    * 分页查询所有记录
    * @param map
    * @return
    */
    @Override
    public PageInfo<ClassInfo> findPage(Map<String, Object> map) {
        PageHelper.startPage(Integer.valueOf(map.get("pageCode").toString()), Integer.valueOf(map.get("pageSize").toString()));
        List<ClassInfo> page = userMapper.findPage(map);
        return new PageInfo<>(page);
    }


    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<User> listAll(Map<String,Object> map) {
    	return userMapper.listAll(map);
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public User getById(String id) {
    	return userMapper.getById(id);
    }

    /**
     * 新增，插入所有字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insert(User user) {
    	return userMapper.insert(user);
    }

    /**
     * 新增，忽略null字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(User user) {
    	return userMapper.insertIgnoreNull(user);
    }

    /**
     * 修改，修改所有字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(User user) {
    	return userMapper.update(user);
    }

    /**
     * 修改，忽略null字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(User user) {
    	return userMapper.updateIgnoreNull(user);
    }

    /**
     * 删除记录
     *
     * @param user 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(User user) {
    	return userMapper.delete(user);
    }

}
