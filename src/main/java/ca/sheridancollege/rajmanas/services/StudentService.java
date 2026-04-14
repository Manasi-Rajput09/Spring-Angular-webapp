package ca.sheridancollege.rajmanas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ca.sheridancollege.rajmanas.domain.Student;


public interface StudentService {
	public List <Student> findAll();
	public Student findById(Long id);
	public Student save(Student student);
	public List<Student> saveAll(List<Student> students);
	public void deleteById(Long id);
}
