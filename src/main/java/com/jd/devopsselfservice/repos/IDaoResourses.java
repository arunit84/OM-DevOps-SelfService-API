package com.jd.devopsselfservice.repos;

import com.jd.devopsselfservice.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDaoResourses extends JpaRepository<Resource, Integer> {
}
