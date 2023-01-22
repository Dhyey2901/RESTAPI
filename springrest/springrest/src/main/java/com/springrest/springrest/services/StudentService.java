package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	
	public Student getStudent(int St_id);
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(int St_id);
	
}
