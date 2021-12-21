package com.joe.oss.controller;

import com.joe.oss.server.ossServer;
import com.joe.oss.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;

@RestController
@RequestMapping("/world/fileoss")
@CrossOrigin
public class controller {
    @Autowired
    private ossServer os;


    @RequestMapping("instantOssFile")
    public R instantOssFile(MultipartFile file){
        /*MultipartFile 马蹄帕特坏哦  获取上传的文件*/
       String url= os.instantOssFileAvatar(file);
        return R.ok().data("url",url);

    }

}
