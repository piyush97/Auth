package com.gonuclei.authentication.authwithreact.services;

import com.gonuclei.authentication.authwithreact.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoursesHardcodedService {
    private static List<Course> courses = new ArrayList<>();
    private static long idCounter = 0;

    static {
        courses.add(new Course(++idCounter, "piyush97", "Hello"));
        courses.add(new Course(++idCounter, "piyush97", "Hi"));
        courses.add(new Course(++idCounter, "piyush97", "test"));
    }

    public List<Course> findAll() {
        return courses;
    }
}
