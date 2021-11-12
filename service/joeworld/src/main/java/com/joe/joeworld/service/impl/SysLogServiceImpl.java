package com.joe.joeworld.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.joe.joeworld.dao.SysLogMapper;
import com.joe.joeworld.entity.SysLog;
import com.joe.joeworld.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;

    /**
    * 分页查询所有记录
    * @param map
    * @return
    */
    @Override
    public PageInfo<ClassInfo> findPage(Map<String, Object> map) {
        PageHelper.startPage(Integer.valueOf(map.get("pageCode").toString()), Integer.valueOf(map.get("pageSize").toString()));
        List<ClassInfo> page = sysLogMapper.findPage(map);
        return new PageInfo<>(page);
    }


    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<SysLog> listAll(Map<String,Object> map) {
    	return sysLogMapper.listAll(map);
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public SysLog getById(Long id) {
    	return sysLogMapper.getById(id);
    }

    /**
     * 新增，插入所有字段
     *
     * @param sysLog 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insert(SysLog sysLog) {
    	return sysLogMapper.insert(sysLog);
    }

    /**
     * 新增，忽略null字段
     *
     * @param sysLog 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(SysLog sysLog) {
    	return sysLogMapper.insertIgnoreNull(sysLog);
    }

    /**
     * 修改，修改所有字段
     *
     * @param sysLog 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(SysLog sysLog) {
    	return sysLogMapper.update(sysLog);
    }

    /**
     * 修改，忽略null字段
     *
     * @param sysLog 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(SysLog sysLog) {
    	return sysLogMapper.updateIgnoreNull(sysLog);
    }

    /**
     * 删除记录
     *
     * @param sysLog 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(SysLog sysLog) {
    	return sysLogMapper.delete(sysLog);
    }

}
