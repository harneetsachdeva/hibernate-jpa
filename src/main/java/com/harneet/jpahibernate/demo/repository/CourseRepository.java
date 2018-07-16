package com.harneet.jpahibernate.demo.repository;

import javax.persistence.EntityManager;

import com.harneet.jpahibernate.demo.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class CourseRepository {

    @Autowired
    EntityManager em;

    public Course findById(Long id){
        return em.find(Course.class, id);
    }

    //public Course save(Course course) -> insert or update

    //public void deleteById(Long id)

}
