package com.joe.joeworld.comtroller;

import com.joe.joeworld.entity.EduTeacher;
import com.joe.joeworld.service.Teacherservice;
import com.github.pagehelper.PageInfo;
import com.joe.commonutils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("/teacher")
@CrossOrigin //跨域
/* 类注解 */
@Api(value = "讲师管理")
public class EduTeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private Teacherservice eduTeacherService;


    /**
     * 分页查询
     * @param params
     * @return
     */
    @ApiOperation(value = "分页查询所有讲师列表")
    @RequestMapping("/findPage")
    public PageInfo<ClassInfo> findPage(@RequestParam Map<String, Object> params){
        PageInfo<ClassInfo> pageInfo = eduTeacherService.findPage(params);
        return pageInfo;
    }


    /**
     *查询所有记录
     * @param params
     * @return 返回集合，没有返回空List
     */
    @ApiOperation(value = "查询所有讲师列表")
    @RequestMapping("list")
    public R listAll(@RequestParam Map<String, Object> params) {
        return  R.ok(eduTeacherService.listAll(params));
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @ApiOperation(value = "根据id查询讲师")
    @RequestMapping("getById")
    public EduTeacher getById(String id) {
        return eduTeacherService.getById(id);
    }

    /**
     * 新增，忽略null字段
     *
     * @param eduTeacher 新增的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "新增讲师")
    @RequestMapping("insert")
    public R insert(@RequestBody EduTeacher eduTeacher) {
        return R.ok(eduTeacherService.insertIgnoreNull(eduTeacher));
    }

    /**
     * 修改，忽略null字段
     *
     * @param eduTeacher 修改的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "修改讲师")
    @RequestMapping("update")
    public R update(@RequestBody EduTeacher eduTeacher) {
        return R.ok(eduTeacherService.updateIgnoreNull(eduTeacher));
    }

    /**
     * 删除记录
     *
     * @param eduTeacher 待删除的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "删除讲师物理删除")
    @RequestMapping("delete")
    public R delete(@RequestBody EduTeacher eduTeacher) {
        int delete = eduTeacherService.delete(eduTeacher);
        if (delete > 0) {
            return R.ok();
        }
        return R.error();
    }

}
