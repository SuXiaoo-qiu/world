package com.joe.joeworld.service;

import com.github.pagehelper.PageInfo;
import com.joe.joeworld.entity.Subject;
import org.springframework.cglib.core.ClassInfo;

import java.util.List;
import java.util.Map;

public interface SubjectService {

        /**
         *   分页查询所有记录
         * @param map
         * @return
         */
        PageInfo<ClassInfo> findPage(Map<String,Object> map);

        /**
         * 测试自定义异常
         * @return
         */
        List<Subject> worldEx();

        /**
         * 查询所有记录
         *
         * @return 返回集合，没有返回空List
         */
        List<Subject> listAll(Map<String,Object> map);

        /**
         * 根据主键查询
         *
         * @param id 主键
         * @return 返回记录，没有返回null
         */
        Subject getById(String id);

        /**
         * 新增，插入所有字段
         *
         * @param subject 新增的记录
         * @return 返回影响行数
         */
        int insert(Subject subject);

        /**
         * 新增，忽略null字段
         *
         * @param subject 新增的记录
         * @return 返回影响行数
         */
        int insertIgnoreNull(Subject subject);

        /**
         * 修改，修改所有字段
         *
         * @param subject 修改的记录
         * @return 返回影响行数
         */
        int update(Subject subject);

        /**
         * 修改，忽略null字段
         *
         * @param subject 修改的记录
         * @return 返回影响行数
         */
        int updateIgnoreNull(Subject subject);

        /**
         * 删除记录
         *
         * @param subject 待删除的记录
         * @return 返回影响行数
         */
        int delete(Subject subject);

    }
