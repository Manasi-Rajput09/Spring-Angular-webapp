import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Student } from '../student';
import { StudentService } from '../student-service';

@Component({
	selector: 'app-student-add',
	imports: [FormsModule],
	templateUrl: './student-add.html',
	styleUrl: './student-add.css',
})
export class StudentAdd {
	//Connect to the student in the HTML page.

	student: Student = {
		id: 0,
		name: '',
		age: 0
	};

	//Connect to your student service
	studentService = inject(StudentService);

	saveStudent(): void {
		//Collect your data in the html page
		const data = {
			name: this.student.name,
			age: this.student.age
		};
		//Send the data to the student service,
		this.studentService.saveStudent(data);
		//Reset the data to add the next student.
		this.student.name = "";
		this.student.age = 0;
	}
}
