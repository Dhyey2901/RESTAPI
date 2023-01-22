package com.springrest.springrest.services;

//import java.util.ArrayList;

import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	//List<Student> list;
	

	@Override
	public List<Student> getStudents() {
		
		return studentDao.findAll();
	}


	@Override
	public Student getStudent(int St_id) 
	{
		// TODO Auto-generated method stub
		
//		Student s = null;
//		
//		for(Student student:list)
//		{
//			if(student.getStu_id()==St_id)
//			{
//				s = student;
//				break;
//			}
//		}
//		return s;
		return studentDao.getReferenceById(St_id);
	}


	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
//		list.add(student);
		studentDao.save(student);
		return student;
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{
//			if(e.getStu_id()==student.getStu_id()) {
//				e.setName(student.getName());
//				e.setStu_id(student.getStu_id());
//			}
//		});
//		return student;
		studentDao.save(student);
		return student;
	}


	public void deleteStudent(int parseInt) {
		// TODO Auto-generated method stub
		//list = this.list.stream().filter(e->e.getStu_id()!=parseInt).collect(Collectors.toList());
		
		Student s=studentDao.getReferenceById(parseInt);
		studentDao.delete(s);
	}
	
	
}