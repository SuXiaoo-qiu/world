package com.joe.testonedemo.controller;

import com.github.pagehelper.PageInfo;
import com.joe.testonedemo.entity.User;
import com.joe.testonedemo.service.UserService;
import com.joe.testonedemo.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/User")
@CrossOrigin //跨域
/* 类注解 */
@Api(value = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 分页查询
     * @param params
     * @return
     */
    @ApiOperation(value = "条件查询分页")
    @RequestMapping("/findPage")
    public PageInfo<ClassInfo> findPage(@RequestParam Map<String, Object> params){
        PageInfo<ClassInfo> pageInfo = userService.findPage(params);
        return pageInfo;
    }

    /**
    *查询所有记录
    * @param params
    * @return 返回集合，没有返回空List
    */
    @ApiOperation(value = "条件查询全部数据")
    @RequestMapping("list")
    public R listAll(@RequestParam Map<String, Object> params) {
        return  R.ok(userService.listAll(params));
    }

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @ApiOperation(value = "根据id查询")
    @RequestMapping("getById")
    public User getById(String id) {
        return userService.getById(id);
    }

    /**
     * 新增，忽略null字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "新增")
    @RequestMapping("insert")
    public R insert(@RequestBody User user) {
   		 return R.ok(userService.insertIgnoreNull(user));
    }

    /**
     * 修改，忽略null字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "修改")
    @RequestMapping("update")
    public R update(@RequestBody User user) {
        return R.ok(userService.updateIgnoreNull(user));
    }

    /**
     * 删除记录
     *
     * @param user 待删除的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "删除物理删除")
    @RequestMapping("delete")
    public R delete(@RequestBody User user) {
     	int delete = userService.delete(user);
          if (delete > 0) {
              return R.ok("删除成功");
          }
          return R.error("删除失败");
      }
}
