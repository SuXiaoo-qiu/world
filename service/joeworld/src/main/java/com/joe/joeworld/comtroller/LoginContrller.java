package com.joe.joeworld.comtroller;

import com.joe.servicebase.entity.R;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin //跨域 可rua神奥润洁
@RequestMapping("/user")
public class LoginContrller {


    //login
    @PostMapping("login")
    public R login(){

        return R.ok().data("token","admin");
    }

    //loginfo
    @GetMapping("info")
    public R logInfo(){

        return R.ok().data("roles","[admin]").data("name","xiaowangba").data("avatar","https://online-teach-file.oss-cn-beijing.aliyuncs.com/cms/2019/11/14/297acd3b-b592-4cfb-a446-a28310369675.jpg");
    }

}
