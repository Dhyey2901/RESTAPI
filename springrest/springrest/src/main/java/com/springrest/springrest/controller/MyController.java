package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Student;
import com.springrest.springrest.services.StudentService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080")
public class MyController {
		
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/home")
	public String Home()
		{
			return "Welcome to Student Application";
		}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return this.studentService.getStudents();
	}
	
	@GetMapping("/students/{St_id}")
	public Student getStudent(@PathVariable int St_id)
	{
		return this.studentService.getStudent(St_id);
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		return this.studentService.addStudent(student);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student)
	{
		return this.studentService.updateStudent(student);
	}
	
	@DeleteMapping("/students/{Stu_id}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable int Stu_id)
	{
		try {
			this.studentService.deleteStudent(Stu_id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}