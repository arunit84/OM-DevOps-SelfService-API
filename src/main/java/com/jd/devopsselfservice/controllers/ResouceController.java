package com.jd.devopsselfservice.controllers;

import com.jd.devopsselfservice.model.Resource;
import com.jd.devopsselfservice.services.ResouceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

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
        Resource resource = null;
        try{
            resource = rService.findById(id);
        }catch (NoSuchElementException ex){
            throw  new ResourceNotFoundException("Get request failed for Resource/Tool with RID : "+id+ " :: Not found in records");
        }
        return resource;
    }

    @PostMapping(path="resources")
    @ResponseStatus(HttpStatus.CREATED)
    public Resource saveResource(@Valid @RequestBody Resource rsc) {           // POST & url: http://localhost:9099/resources

        return rService.saveResource(rsc);
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
