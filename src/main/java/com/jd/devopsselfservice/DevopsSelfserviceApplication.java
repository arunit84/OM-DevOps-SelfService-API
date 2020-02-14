package com.jd.devopsselfservice;

import com.jd.devopsselfservice.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.CrossOrigin;
import  org.springframework.web.multipart.commons.CommonsMultipartResolver;

@CrossOrigin
@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class DevopsSelfserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsSelfserviceApplication.class, args);
    }

}
