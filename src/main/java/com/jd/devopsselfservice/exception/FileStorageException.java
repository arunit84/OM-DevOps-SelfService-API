package com.jd.devopsselfservice.exception;


import  org.springframework.web.multipart.commons.CommonsMultipartResolver;

    public class FileStorageException extends RuntimeException {
        public FileStorageException(String message) {
            super(message);
        }

        public FileStorageException(String message, Throwable cause) {
            super(message, cause);
        }
    }

