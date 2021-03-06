package com.gonuclei.authentication.authwithreact.resource;

import java.util.List;

import com.gonuclei.authentication.authwithreact.model.Course;
import com.gonuclei.authentication.authwithreact.services.CoursesHardcodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class CourseResource {
    @Autowired
    private CoursesHardcodedService courseManagementService;
    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {
        return courseManagementService.findAll();
    }
}
