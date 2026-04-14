package ca.sheridancollege.rajmanas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.rajmanas.domain.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
	public Optional<Student> findByName(String name);
}
