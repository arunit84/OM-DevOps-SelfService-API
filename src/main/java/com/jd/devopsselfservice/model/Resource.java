package com.jd.devopsselfservice.model;

import javax.persistence.*;

@Entity
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RSC_ID")
    private int rid;
    @Column(name = "RSC_NAME")
    private String rsc_name ;
    @Column(name = "RSC_DESC")
    private  String description;
    @Column(name = "IMG_LINK")
    private String img_link ;
    @Column(name = "RSC_LINK")
    private  String rsc_link;
    @Column(name = "RSC_LINK_TEXT")
    private  String rsc_link_text;

    public Resource() {

    }

    public Resource(String rsc_name, String description, String img_link, String rsc_link, String rsc_link_text) {
        this.rsc_name = rsc_name;
        this.description = description;
        this.img_link = img_link;
        this.rsc_link = rsc_link;
        this.rsc_link_text = rsc_link_text;
    }


    public String getRsc_link_text() {
        return rsc_link_text;
    }

    public void setRsc_link_text(String rsc_link_text) {
        this.rsc_link_text = rsc_link_text;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRsc_name() {
        return rsc_name;
    }

    public void setRsc_name(String rsc_name) {
        this.rsc_name = rsc_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg_link() {
        return img_link;
    }

    public void setImg_link(String img_link) {
        this.img_link = img_link;
    }

    public String getRsc_link() {
        return rsc_link;
    }

    public void setRsc_link(String rsc_link) {
        this.rsc_link = rsc_link;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "rid=" + rid +
                ", rsc_name='" + rsc_name + '\'' +
                ", description='" + description + '\'' +
                ", img_link='" + img_link + '\'' +
                ", rsc_link='" + rsc_link + '\'' +
                ", rsc_link_text='" + rsc_link_text + '\'' +
                '}';
    }
}
