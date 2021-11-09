package com.joe.joeworld.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.joe.joeworld.dao.EduTeacherMapper;
import com.joe.joeworld.entity.EduTeacher;
import com.joe.joeworld.service.Teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EduTeacherServiceImpl implements Teacherservice {

    @Autowired
    private EduTeacherMapper eduTeacherMapper;

    @Override
    public PageInfo<ClassInfo> findPage(int pageCode, int pageSize) {
        PageHelper.startPage(pageCode, pageSize);
        List<ClassInfo> page = eduTeacherMapper.findPage();

        return new PageInfo<>(page);
    }

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<EduTeacher> listAll(Map<String,Object> map) {
    	return eduTeacherMapper.listAll(map);
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public EduTeacher getById(String id) {
    	return eduTeacherMapper.getById(id);
    }

    /**
     * 新增，插入所有字段
     *
     * @param eduTeacher 新增的记录
     * @return 返回影响行数
     */
    public int insert(EduTeacher eduTeacher) {
    	return eduTeacherMapper.insert(eduTeacher);
    }

    /**
     * 新增，忽略null字段
     *
     * @param eduTeacher 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(EduTeacher eduTeacher) {
    	return eduTeacherMapper.insertIgnoreNull(eduTeacher);
    }

    /**
     * 修改，修改所有字段
     *
     * @param eduTeacher 修改的记录
     * @return 返回影响行数
     */
    public int update(EduTeacher eduTeacher) {
    	return eduTeacherMapper.update(eduTeacher);
    }

    /**
     * 修改，忽略null字段
     *
     * @param eduTeacher 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(EduTeacher eduTeacher) {
    	return eduTeacherMapper.updateIgnoreNull(eduTeacher);
    }

    /**
     * 删除记录
     *
     * @param eduTeacher 待删除的记录
     * @return 返回影响行数
     */
    public int delete(EduTeacher eduTeacher) {
    	return eduTeacherMapper.delete(eduTeacher);
    }

}
