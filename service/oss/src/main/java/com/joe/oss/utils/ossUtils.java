package com.joe.oss.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//当项目启动的时候spring接口加载执行接口的一个方法
@Component
public class ossUtils implements InitializingBean {
    @Value("${aliyun.oss.file.endpoint}")
    private  String endpoint;

    @Value("${aliyun.oss.file.keyid}")
    private  String keyid;

    @Value("${aliyun.oss.file.keysecret}")
    private  String keysecret;

    @Value("${aliyun.oss.file.bucketname}")
    private  String bucketname;

    public static String END_POINT;
    public static String KEY_ID;
    public static String KEY_SECRET;
    public static String BUCKET_NAME;
    /* init 执行完后 这上面的value从pom 中拿值 并且赋值给(endpoint,keyid)他们 然后下面的afterPropertiesSet这个方法是最后执行的
     然后吧(endpoint,keyid)他们的值 赋值给(END_POINT,KEY_ID)这些常量*/
    @Override
    public void afterPropertiesSet() throws Exception {
        END_POINT=endpoint;
        KEY_ID=keyid;
        KEY_SECRET=keysecret;
        BUCKET_NAME=bucketname;
    }
}
