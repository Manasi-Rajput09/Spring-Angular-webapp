package ca.sheridancollege.rajmanas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.rajmanas.domain.Student;
import ca.sheridancollege.rajmanas.services.StudentService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {
	
	private StudentService stuService;
	
	@GetMapping(value= {"/",""})
	public List<Student> getAllStudents(){
		return stuService.findAll();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return stuService.findById(id);
	}
	
	@PostMapping(value= {"/",""}, consumes = "application/json")
	public Student createStudent(@RequestBody Student student) {
		return stuService.save(student);
	}
	
	@PostMapping(value = {"/saveAll"}, consumes = "application/json")
	public List<Student> createStudents(@RequestBody List<Student> studentList) {
		return stuService.saveAll(studentList);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudentById(@PathVariable Long id) {
		stuService.deleteById(id);
	}
	
}
