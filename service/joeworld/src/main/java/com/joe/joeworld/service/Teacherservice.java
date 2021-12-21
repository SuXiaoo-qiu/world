package com.joe.joeworld.service;


import com.joe.joeworld.config.PageInfo;
import com.joe.joeworld.entity.EduTeacher;
import org.springframework.cglib.core.ClassInfo;

import java.util.List;
import java.util.Map;

public interface Teacherservice {
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
        List<EduTeacher> listAll(Map<String,Object> map);


        /**
         * 根据主键查询
         *
         * @param id 主键
         * @return 返回记录，没有返回null
         */
        EduTeacher getById(String id);

        /**
         * 新增，插入所有字段
         *
         * @param eduTeacher 新增的记录
         * @return 返回影响行数
         */
        int insert(EduTeacher eduTeacher);

        /**
         * 新增，忽略null字段
         *
         * @param eduTeacher 新增的记录
         * @return 返回影响行数
         */
        int insertIgnoreNull(EduTeacher eduTeacher);

        /**
         * 修改，修改所有字段
         *
         * @param eduTeacher 修改的记录
         * @return 返回影响行数
         */
        int update(EduTeacher eduTeacher);

        /**
         * 修改，忽略null字段
         *
         * @param eduTeacher 修改的记录
         * @return 返回影响行数
         */
        int updateIgnoreNull(EduTeacher eduTeacher);

        /**
         * 删除记录
         *
         * @param eduTeacher 待删除的记录
         * @return 返回影响行数
         */
        int delete(EduTeacher eduTeacher);



}
