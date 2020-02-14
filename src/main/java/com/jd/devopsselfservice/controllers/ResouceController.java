package com.jd.devopsselfservice.controllers;

import com.jd.devopsselfservice.model.Resource;
import com.jd.devopsselfservice.services.ResouceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.awt.print.Book;
import java.util.List;

@CrossOrigin
@RestController
public class ResouceController {

    @Autowired
    ResouceService rService;

    @GetMapping("/resources")
    public List<Resource> retriveAllResources() {     //POST & url: http://localhost:9099/resources
        return rService.findAll();
    }

    @GetMapping("/resources/{id}")
    public Resource getResourcesById(@PathVariable int id) {    //get method in postman and url http://localhost:9099/resources/10
        return rService.findById(id);
    }

    @PostMapping(path="resources")
    public void saveResource(@RequestBody Resource rsc) {           // POST & url: http://localhost:9099/resources
        rService.saveResource(rsc);
    }

    @DeleteMapping(path="/resources/{id}")   // select delete method in postman and url http://localhost:9099/resources/10
    public void deleteResource(@PathVariable int id) {
        rService.deleteById(id);
    }

    @PutMapping(path="resources")
    public void updateResource(@RequestBody Resource rsc) {     // POST & url: http://localhost:9099/resources
        rService.putResource(rsc);
    }





}
