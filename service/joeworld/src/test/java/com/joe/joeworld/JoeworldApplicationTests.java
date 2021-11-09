package com.joe.joeworld;

import com.joe.joeworld.entity.EduTeacher;
import com.joe.joeworld.service.Teacherservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        EduTeacher byId = teacherservice.getById("6");
        System.out.println(byId);
    }
}
