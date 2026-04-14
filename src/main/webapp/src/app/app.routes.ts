import { Routes } from '@angular/router';
import{StudentHome} from './student/student-home/student-home';
import { StudentList } from './student/student-list/student-list';
import { StudentAdd } from './student/student-add/student-add';

export const routes: Routes = [
	{path: '', component: StudentHome},
	{path: 'add', component: StudentAdd},
	{path: 'view', component: StudentList},
];
