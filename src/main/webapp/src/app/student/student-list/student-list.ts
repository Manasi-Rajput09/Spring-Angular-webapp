import { Component, inject } from '@angular/core';
import {StudentService} from '../student-service';
@Component({
  selector: 'app-student-list',
  imports: [],
  templateUrl: './student-list.html',
  styleUrl: './student-list.css',
})
export class StudentList {
studentService = inject(StudentService);

   deleteStudent(id: any): void {
        if (confirm("Are you sure you want to delete " + id + "?")) {
            this.studentService.deleteStudentById(id);
            window.location.reload();
        }
    }

}
