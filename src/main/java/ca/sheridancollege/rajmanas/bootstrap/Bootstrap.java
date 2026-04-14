package ca.sheridancollege.rajmanas.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.rajmanas.domain.Student;
import ca.sheridancollege.rajmanas.services.StudentService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Bootstrap implements CommandLineRunner {
	private StudentService stuService;
	
	@Override
	public void run(String...args) throws Exception{
	
		if(stuService.findAll().size()>0) return;
		stuService.save(Student.builder().name("Katrina Kaif").age(20).build());
		stuService.save(Student.builder().name("Fila fula").age(22).build());
		stuService.save(Student.builder().name("Alice Johnson").age(19).build());
		stuService.save(Student.builder().name("Bob Builder").age(21).build());
		 System.out.println("Data Loaded: " + stuService.findAll().size() + " students");
	}

}

