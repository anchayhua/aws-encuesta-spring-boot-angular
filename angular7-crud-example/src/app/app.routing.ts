import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from "./login/login.component";
import { AddUserComponent } from "./add-user/add-user.component";
import { ListUserComponent } from "./list-user/list-user.component";
import { EditUserComponent } from "./edit-user/edit-user.component";
import { AddEncuestaComponent } from "./add-encuesta/add-encuesta.component";
import { ListEncuestaComponent } from "./list-encuesta/list-encuesta.component";

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'add-user', component: AddUserComponent },
  { path: 'list-user', component: ListUserComponent },
  { path: 'edit-user', component: EditUserComponent },
  { path: 'add-encuesta', component: AddEncuestaComponent },
  { path: 'list-encuesta', component: ListEncuestaComponent },
  { path: '', component: LoginComponent }
];

export const routing = RouterModule.forRoot(routes);
