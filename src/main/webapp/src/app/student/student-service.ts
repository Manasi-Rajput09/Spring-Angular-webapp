import { Injectable, inject, signal } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from './student';
//This is our URL that should match our RequestMapping
//in our Spring project.
const restUrl = '/api/v1/students';

@Injectable({
	providedIn: 'root'
})

export class StudentService {
	//We build up the variables that allow us to access
	//a web client using signal.
	private http = inject(HttpClient);

	students = signal<Student[]>([]);
	//We need to go back to our student service to read our web service and get the list of students.
	constructor() {
		this.getStudents();
	}
	getStudents(): void {
		this.http.get<Student[]>(restUrl).subscribe(data => {
			this.students.set(data);
		});
	}

    // ADD THIS METHOD
    saveStudent(data: Student): void {
        this.http.post<Student>(restUrl, data).subscribe(saved => {
            this.students.update(students => [...students, saved]);
        });
    }

    deleteStudentById(id: number): void {
        this.http.delete<void>(restUrl + "/" + id).subscribe();
    }
}