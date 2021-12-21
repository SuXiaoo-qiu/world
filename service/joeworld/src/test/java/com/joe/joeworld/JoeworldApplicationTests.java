package com.joe.joeworld;

import com.joe.joeworld.config.PageInfo;
import com.joe.joeworld.entity.EduTeacher;
import com.joe.joeworld.service.Teacherservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.core.ClassInfo;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
class JoeworldApplicationTests {
    @Autowired
    Teacherservice teacherservice;
    @Test
    void contextLoads() {
    }
    @Test
    public void test(){

        List<EduTeacher> teachers = teacherservice.listAll(new HashMap<>());
        teachers.forEach(System.out::println);
    }
    @Test
    public void tews(){
        EduTeacher byId = teacherservice.getById("5");
        System.out.println(byId+"测试");
    }

    @Test
    public void tew(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("pageCode",0);
        hashMap.put("pageSize",5);
        hashMap.put("name","王五");
        PageInfo<ClassInfo> page = teacherservice.findPage(hashMap);
        System.out.println(page);
    }
}
