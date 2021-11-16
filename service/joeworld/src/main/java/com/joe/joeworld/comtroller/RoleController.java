package com.joe.joeworld.comtroller;

import com.github.pagehelper.PageInfo;
import com.joe.commonutils.R;
import com.joe.joeworld.entity.Role;
import com.joe.joeworld.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassInfo;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 *角色管理
 */
@RestController
@RequestMapping("/Role")
@CrossOrigin //跨域
/* 类注解 */
@Api(value = "角色管理")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 分页查询
     * @param params
     * @return
     */
    @ApiOperation(value = "条件查询分页")
    @RequestMapping("/findPage")
    public PageInfo<ClassInfo> findPage(@RequestParam Map<String, Object> params){
        PageInfo<ClassInfo> pageInfo = roleService.findPage(params);
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
        return  R.ok(roleService.listAll(params));
    }

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @ApiOperation(value = "根据id查询")
    @RequestMapping("getById")
    public Role getById(String id) {
        return roleService.getById(id);
    }

    /**
     * 新增，忽略null字段
     *
     * @param role 新增的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "新增")
    @RequestMapping("insert")
    public R insert(@RequestBody Role role) {
   		 return R.ok(roleService.insertIgnoreNull(role));
    }

    /**
     * 修改，忽略null字段
     *
     * @param role 修改的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "修改")
    @RequestMapping("update")
    public R update(@RequestBody Role role) {
        return R.ok(roleService.updateIgnoreNull(role));
    }

    /**
     * 删除记录
     *
     * @param role 待删除的记录
     * @return 返回影响行数
     */
    @ApiOperation(value = "删除物理删除")
    @RequestMapping("delete")
    public R delete(@RequestBody Role role) {
     	int delete = roleService.delete(role);
          if (delete > 0) {
              return R.ok("删除成功");
          }
          return R.error("删除失败");
      }
}
