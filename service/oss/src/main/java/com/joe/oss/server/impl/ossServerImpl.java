package com.joe.oss.server.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.PutObjectRequest;
import com.joe.oss.server.ossServer;
import com.joe.oss.utils.ossUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;

@Service
public class ossServerImpl implements ossServer{
    @Override
    public String instantOssFileAvatar(MultipartFile file) {
        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
        String endpoint = ossUtils.END_POINT;
        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        String accessKeyId = ossUtils.KEY_ID;
        String accessKeySecret = ossUtils.KEY_SECRET;
        String bucketName = ossUtils.BUCKET_NAME;
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        try {

            // 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。(获取文件的输入流)
            InputStream inputStream =  file.getInputStream();
            //获取文件名字(没有改之前的)
            String fileName = file.getOriginalFilename().replace("/", "");
            String uuidName = UUID.randomUUID().toString().replace("-", "");
            fileName=uuidName+fileName;

            String datePate = new DateTime().toString("yyyy/MM/dd");
            fileName=datePate+"/"+fileName;
            /**
             * 调用oss 实现上传
             * 第一个参数 bucket 的名字
             *  第二个参数 是文件路径喝name
             *  第三个是文件输入流
             */
            ossClient.putObject(bucketName,fileName , inputStream);

                /*https://joe-world.oss-cn-shanghai.aliyuncs.com*/
            String url="https://"+bucketName+"."+endpoint+"/"+fileName;
            return url;

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 关闭OSSClient。
            ossClient.shutdown();
        }

        return null;
    }
}
