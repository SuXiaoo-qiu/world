package com.joe.joeworld.comtroller;


import com.github.pagehelper.PageInfo;
import com.joe.commonutils.R;
import com.joe.joeworld.entity.Subject;
import com.joe.joeworld.service.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@CrossOrigin //跨域
@RestController
@RequestMapping("/subject")
/* 类注解 */
@Api(value = "课程科目管理")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    /**
     * 分页查询
     * @param params
     * @return
     */
    @ApiOperation(value = "条件查询分页")
    @RequestMapping("/findPage")
    public PageInfo<ClassInfo> findPage(@RequestParam Map<String, Object> params){
        PageInfo<ClassInfo> pageInfo = subjectService.findPage(params);
        return pageInfo;
    }

    /**
     * 测试自定义异常
     * @param params
     * @return
     */
    @ApiOperation(value = "测试自定义异常")
    @RequestMapping("/worldEx")
    @ResponseBody
    public R worldEx(){
        List<Subject> subjects = subjectService.worldEx();
        if (subjects.size() > 0){
        return R.ok();
        }
        return R.error();
    }

    /**
    *查询所有记录
    * @param params
    * @return 返回集合，没有返回空List
    */
    @ApiOperation(value = "条件查询全部数据")
    @RequestMapping("list")
    public R listAll(@RequestParam Map<String, Object> params) {
        List<Subject> subjects = subjectService.listAll(params);
        if (subjects.size() > 0){
            return  R.ok().data("subjects",subjects);
        }
        return R.error();
    }

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @ApiOperation(value = "根据id查询")
    @RequestMapping("getById")
    public Subject getById(String id) {
        return subjectService.getById(id);
    }

    /**
     * 新增，忽略null字段
     *
     * @param subject 新增的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "新增")
    @RequestMapping("insert")
    public R insert(@RequestBody Subject subject) {
        int i = subjectService.insertIgnoreNull(subject);
        if (i > 0) {
            return R.ok();

        }
        return R.error();
    }

    /**
     * 修改，忽略null字段
     *
     * @param subject 修改的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "修改")
    @RequestMapping("update")
    public R update(@RequestBody Subject subject) {
        int i = subjectService.updateIgnoreNull(subject);
        if (i > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除记录
     *
     * @param subject 待删除的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "删除物理删除")
    @RequestMapping("delete")
    public R delete(@RequestBody Subject subject) {
     	int delete = subjectService.delete(subject);
          if (delete > 0) {
              return R.ok("删除成功");
          }
          return R.error("删除失败");
      }
}
