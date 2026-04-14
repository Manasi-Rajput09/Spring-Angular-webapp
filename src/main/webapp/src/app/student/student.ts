import { Component } from '@angular/core';
import { StudentAdd } from './student-add/student-add';
import { StudentList } from './student-list/student-list'

//new 
import { RouterLink, RouterOutlet, Routes } from '@angular/router';

@Component({
  selector: 'app-student',
  imports: [StudentAdd, StudentList, RouterLink, RouterOutlet],
  templateUrl: './student.html',
  styleUrl: './student.css',
})
export class Student {
  id?: number;
  name?: string;
  age?: number;
}
