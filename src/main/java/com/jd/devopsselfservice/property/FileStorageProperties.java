package com.jd.devopsselfservice.property;


import org.springframework.boot.context.properties.ConfigurationProperties;
import  org.springframework.web.multipart.commons.CommonsMultipartResolver;

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}