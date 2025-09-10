package com.vishal.StudentsManagementSystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vishal.StudentsManagementSystem.entity.Student;
import com.vishal.StudentsManagementSystem.service.StudentService;

@org.springframework.stereotype.Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/students")
	public String getAllStudent(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "students";

	}

	@GetMapping("student/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("students", student);
		return "create-student";

	}

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable int id, Model model) {
		model.addAttribute("student", service.getById(id));
		return "edit_student";

	}

	@GetMapping("/students/{id}")
	public String deleteById(@PathVariable int id) {
		service.deleteById(id);

		return "redirect:/students";
	}

	@PostMapping("/students")
	public String saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			// Agar validation fail ho to form page wapas dikhao
			model.addAttribute("student", student);
			return "create-student";
		}
		service.saveStudent(student);
		return "redirect:/students";
	}

	@PostMapping("/students/edit/{id}")
	public String updateStudent(@PathVariable int id, @Valid @ModelAttribute("student") Student student,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			student.setId(id); // id set karna zaruri hai form ke liye
			model.addAttribute("student", student);
			return "edit_student";
		}

		Student existingStudent = service.getById(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());

		service.saveStudent(existingStudent);
		return "redirect:/students";
	}
}
