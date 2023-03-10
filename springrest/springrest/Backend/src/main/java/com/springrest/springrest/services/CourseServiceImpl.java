package com.springrest.springrest.services;

//import java.util.ArrayList;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Collectors;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl implements CourseService {

//	List<Course> list;

    @Autowired
    private CourseDao courseDao;

/*
    public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java Core course","This course contains core java course"));
		list.add(new Course(4343,"Spring boot course","Learning spring boot"));
    }
*/


    @Override
    public List<Course> getCourses() {
//		return list;
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(int id) {
//		Course c = null;
//		for (Course course:list) {
//			if(course.getId()==id){
//				c=course;
//				break;
//			}
//		}
//
//		return c;
        return courseDao.getOne(id);
    }

    @Override
    public Course addCourse(Course course) {
//		list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
/*
		list.forEach(e ->{
			if(e.getId() == course.getId()){
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});

		return course;
*/
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(int id) {
//		list=this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
        Course c = courseDao.getOne(id);
        courseDao.delete(c);
    }
}