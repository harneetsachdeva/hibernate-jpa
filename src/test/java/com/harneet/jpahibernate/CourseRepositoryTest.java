package com.harneet.jpahibernate;

import com.harneet.jpahibernate.demo.entity.Course;
import com.harneet.jpahibernate.demo.repository.CourseRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CourseRepository repository;

    @Test
    public void contextLoads() {
        Course course = repository.findById(10001L);
        Assert.assertEquals("JPA in 50 Steps",course.getName());
        logger.info("Course 10001 -> {}", course);
    }

}
