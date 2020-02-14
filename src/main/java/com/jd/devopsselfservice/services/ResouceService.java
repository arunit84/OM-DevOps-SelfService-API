package com.jd.devopsselfservice.services;

import com.jd.devopsselfservice.model.Resource;
import com.jd.devopsselfservice.repos.IDaoResourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResouceService {

    @Autowired
    IDaoResourses rDao;

    public Resource findById(int rid) {
        Optional<Resource> r = rDao.findById(rid);
        return r.get();
    }

    public List<Resource> findAll() {
        return rDao.findAll();
    }

    public Resource saveResource(Resource rsc) {
        return rDao.save(rsc);
    }

    public void deleteById(int id) {
        rDao.deleteById(id);

    }

    public void putResource(Resource rsc) {
        Optional<Resource> r = rDao.findById(rsc.getRid());
        if (r.get() != null) {
            rDao.save(rsc);
        }
    }

}
