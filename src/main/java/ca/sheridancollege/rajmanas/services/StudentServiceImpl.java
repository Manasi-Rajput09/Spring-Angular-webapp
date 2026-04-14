package ca.sheridancollege.rajmanas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ca.sheridancollege.rajmanas.domain.Student;
import ca.sheridancollege.rajmanas.repository.StudentRepo;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
	
	private StudentRepo stuRepo;

	@Override
	public List<Student> findAll() {
		
		return stuRepo.findAll();
	}

	@Override
	public Student findById(Long id) {
		Optional<Student> stu = stuRepo.findById(id);
		if (stu.isPresent()) {
			return stu.get();
		} else {
			return null;
		}
	}

	@Override
	public Student save(Student student) {
		
		return stuRepo.save(student);
	}

	@Override
	public List<Student> saveAll(List<Student> students) {
		// TODO Auto-generated method stub
		return stuRepo.saveAll(students);
	}

	@Override
	public void deleteById(Long id) {
		 stuRepo.deleteById(id);
		
	}

}
