package com.vishal.StudentsManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.StudentsManagementSystem.repository.StudentRepository;

import com.vishal.StudentsManagementSystem.entity.Student;
import com.vishal.StudentsManagementSystem.service.StudentService;
@Service
public class ServiceImpl implements StudentService {
	@Autowired
	StudentRepository StudentRepository;

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = StudentRepository.findAll();
		
		return list;
	}
	@Override
	public Student saveStudent(Student student) {
		return StudentRepository.save(student);
		
	}
	@Override
	public Student getById(int id) {
		return StudentRepository.findById(id).get();
		
	}
	
	public void deleteById(int id) {
		
		StudentRepository.deleteById(id);
	}

}
