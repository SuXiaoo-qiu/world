package com.joe.joeworld.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.joe.joeworld.config.PageInfo;
import com.joe.joeworld.dao.EduTeacherMapper;
import com.joe.joeworld.entity.EduTeacher;
import com.joe.joeworld.service.Teacherservice;
import com.joe.servicebase.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EduTeacherServiceImpl implements Teacherservice {

    @Autowired
    private EduTeacherMapper eduTeacherMapper;

    /**
     * 分页查询所有记录
     * @param map
     * @return
     */
    @Override
    public PageInfo<ClassInfo> findPage(Map<String, Object> map) {
        PageHelper.startPage(Integer.valueOf(map.get("pageCode").toString()), Integer.valueOf(map.get("pageSize").toString()));
        List<ClassInfo> page = eduTeacherMapper.findPage(map);
        return new PageInfo<>(page);
    }

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<EduTeacher> listAll(Map<String,Object> map) {
    	return eduTeacherMapper.listAll(map);
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public EduTeacher getById(String id) {
    	return eduTeacherMapper.getById(id);
    }

    /**
     * 新增，插入所有字段
     *
     * @param eduTeacher 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insert(EduTeacher eduTeacher) {
    	return eduTeacherMapper.insert(eduTeacher);
    }

    /**
     * 新增，忽略null字段
     *
     * @param eduTeacher 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(EduTeacher eduTeacher) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println();// new Date()为获取当前系统时间
        if (StringUtil.isEmpty(eduTeacher.getId())){
            eduTeacher.setId(IDUtils.createID());
            eduTeacher.setGmtCreate(df.format(new Date()));
            return eduTeacherMapper.insertIgnoreNull(eduTeacher);

        }else {
            eduTeacher.setGmtModified(df.format(new Date()));
            return eduTeacherMapper.update(eduTeacher);
        }
    }

    /**
     * 修改，修改所有字段
     *
     * @param eduTeacher 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(EduTeacher eduTeacher) {
    	return eduTeacherMapper.update(eduTeacher);
    }

    /**
     * 修改，忽略null字段
     *
     * @param eduTeacher 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(EduTeacher eduTeacher) {
    	return eduTeacherMapper.updateIgnoreNull(eduTeacher);
    }

    /**
     * 删除记录
     *
     * @param eduTeacher 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(EduTeacher eduTeacher) {
    	return eduTeacherMapper.delete(eduTeacher);
    }

}
