package com.joe.oss.server;

import org.springframework.web.multipart.MultipartFile;

public interface ossServer {
    String instantOssFileAvatar(MultipartFile file);
}
