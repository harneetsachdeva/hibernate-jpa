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
    public void findByIdTest() {
        Course course = repository.findById(10001L);
        Assert.assertEquals("JPA in 50 Steps",course.getName());
        logger.info("Course 10001 -> {}", course);
    }

    @Test
    public void deleteByIdTest() {
        repository.deleteById(10001L);
        Course course = repository.findById(10001L);
        logger.info("Course 10001 -> {} removed", course);
        Assert.assertEquals(null,course);
        logger.info("Course 10001 -> {} removed", course);
    }

}
