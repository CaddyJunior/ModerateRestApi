package com.learning.learn_maven.controller;

import com.learning.learn_maven.service.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrievelAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "KB"),
                new Course(2, "Learn Spring", "Nal")
        );
    }

}
