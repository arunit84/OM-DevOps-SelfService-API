package com.jd.devopsselfservice;

import com.jd.devopsselfservice.model.Resource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class DevopsSelfserviceControllerTest extends AbstractTest {
    @Override
    @Before
    public void setUp() {
        super.setUp();
    }
    @Test
    public void getResourceList() throws Exception {
        String uri = "/resources";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        Assert.assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Resource[] resourceList = super.mapFromJson(content, Resource[].class);
        Assert.assertTrue(resourceList.length > 0);
    }

    @Test
    public void createResource() throws Exception {
        String uri = "/products";
        Resource resource = new Resource();
        resource.setRsc_name("Test Resource");
        resource.setDescription("Test Description");
        resource.setImg_link("Test Img link");
        resource.setRsc_link("Test Rec Link");
        resource.setRsc_link_text("Test Resourse link");
        String inputJson = super.mapToJson(resource);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        Assert.assertEquals(201, status);
        /*String content = mvcResult.getResponse().getContentAsString();
        Assert.assertEquals(content, "Resource is created successfully");*/
    }
    /*@Test
    public void updateResource() throws Exception {
        String uri = "/resources/2";
        Resource resource = new Resource();
        resource.setRsc_name("Updated Test Resource Name");
        String inputJson = super.mapToJson(resource);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();



        int status = mvcResult.getResponse().getStatus();
        Assert.assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Assert.assertEquals(content, "Resource is updated successsfully");
    }*/
    /*@Test
    public void deleteResource() throws Exception {
        String uri = "/resources/2";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assert.assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Assert.assertEquals(content, "Resource is deleted successsfully");
    }*/
}
