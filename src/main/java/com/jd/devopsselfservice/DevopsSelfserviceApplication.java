package com.jd.devopsselfservice;

import com.jd.devopsselfservice.property.FileStorageProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(DevopsSelfserviceApplication.class);

    public static void main(String[] args) {
        logger.info("Inside DevopsSelfserviceApplication class");
        SpringApplication.run(DevopsSelfserviceApplication.class, args);
    }

}
