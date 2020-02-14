package com.jd.devopsselfservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String img_name;
    private String img_link;
}
