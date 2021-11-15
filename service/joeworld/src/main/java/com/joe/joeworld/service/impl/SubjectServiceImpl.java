package com.joe.joeworld.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.joe.common.utils.ExceptionUtil;
import com.joe.joeworld.dao.SubjectMapper;
import com.joe.joeworld.entity.Subject;
import com.joe.joeworld.service.SubjectService;
import com.joe.servicebase.entity.worldExcept;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SubjectServiceImpl implements SubjectService {
    private Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private SubjectMapper subjectMapper;

    /**
    * 分页查询所有记录
    * @param map
    * @return
    */
    @Override
    public PageInfo<ClassInfo> findPage(Map<String, Object> map) {
        PageHelper.startPage(Integer.parseInt(map.get("pageCode").toString()), Integer.parseInt(map.get("pageSize").toString()));
        List<ClassInfo> page = subjectMapper.findPage(map);
        return new PageInfo<>(page);

    }


    /**
     * 测试自定义异常
     * @param map
     * @return
     */
    @Override
    public List<Subject> worldEx() {
        try {
            int a =1/0;
        }catch (Exception e) {
            e.printStackTrace();
            logger.info(ExceptionUtil.getMessage(e));
            throw  new  worldExcept(500,"测试执行了自定义异常");

        }


        return null;
    }



    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<Subject> listAll(Map<String,Object> map) {
    	return subjectMapper.listAll(map);
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public Subject getById(String id) {
    	return subjectMapper.getById(id);
    }

    /**
     * 新增，插入所有字段
     *
     * @param subject 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insert(Subject subject) {
    	return subjectMapper.insert(subject);
    }

    /**
     * 新增，忽略null字段
     *
     * @param subject 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(Subject subject) {
    	return subjectMapper.insertIgnoreNull(subject);
    }

    /**
     * 修改，修改所有字段
     *
     * @param subject 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(Subject subject) {
    	return subjectMapper.update(subject);
    }

    /**
     * 修改，忽略null字段
     *
     * @param subject 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(Subject subject) {
    	return subjectMapper.updateIgnoreNull(subject);
    }

    /**
     * 删除记录
     *
     * @param subject 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(Subject subject) {
    	return subjectMapper.delete(subject);
    }

}
