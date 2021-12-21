package com.joe.joeworld.comtroller;

import com.alibaba.fastjson.JSONObject;
import com.joe.joeworld.config.PageInfo;
import com.joe.joeworld.entity.EduTeacher;
import com.joe.joeworld.service.Teacherservice;
import com.joe.commonutils.R;
import com.joe.servicebase.utils.IDUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping("/teacher")
@CrossOrigin //跨域
/* 类注解 */
@Api(value = "讲师管理")
public class EduTeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private Teacherservice eduTeacherService;


    /**~
     * 分页查询
     * @param params
     * @return
     */
    @ApiOperation(value = "分页查询所有讲师列表")
    @RequestMapping("/findPage")
    public PageInfo<ClassInfo> findPage(@RequestBody JSONObject body){
        PageInfo<ClassInfo> pageInfo = eduTeacherService.findPage(body);
        if (pageInfo.getList().size() > 0){
            pageInfo.setCode(200);
            pageInfo.setMessage("成功");
        }else {
            pageInfo.setPageSize(0);
            pageInfo.setCode(500);
            pageInfo.setMessage("暂无数据");
        }

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
        List<EduTeacher> eduTeachers = eduTeacherService.listAll(params);

        return  R.ok().data("eduTeachers",eduTeachers);
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @ApiOperation(value = "根据id查询讲师")
    @PostMapping("getById")


    public R getById(@RequestBody JSONObject body) {
        EduTeacher byId = eduTeacherService.getById(body.getString("id"));
        return R.ok().data("EduTeacher",byId);
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


        int i = eduTeacherService.insertIgnoreNull(eduTeacher);
        if (i > 0) {
            return R.ok();
        }
        return R.error();

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
        int i = eduTeacherService.updateIgnoreNull(eduTeacher);
        if (i > 0) {
            return R.ok();

        }
        return R.error();
    }

    /**
     * 删除记录
     *
     * @param eduTeacher 待删除的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "删除讲师物理删除")
    @CrossOrigin //跨域
    @RequestMapping("delete")
    public R delete(@RequestBody JSONObject body) {
        body.get("ids");
        EduTeacher eduTeacher = new EduTeacher();
        eduTeacher.setId(body.get("ids").toString());
        int delete = eduTeacherService.delete(eduTeacher);
        if (delete > 0) {
            return R.ok();
        }
        return R.error();
    }

}
