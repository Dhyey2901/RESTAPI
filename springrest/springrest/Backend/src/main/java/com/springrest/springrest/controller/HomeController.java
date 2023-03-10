package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    public CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourse() {
        return this.courseService.getCourses();
    }

    @GetMapping("/course/{course_id}")
    public Course getCourse(@PathVariable int course_id) {
        return this.courseService.getCourse(course_id);
    }

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/course/{course_id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int course_id) {
        try {
            this.courseService.deleteCourse(course_id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}