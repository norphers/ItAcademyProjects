import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from "./components/home/home.component";
import { CurriculumComponent } from "./components/curriculum/curriculum.component";
import { ProjectsComponent } from "./components/projects/projects.component";
import { BlogComponent } from "./components/blog/blog.component";
import { ContactComponent } from "./components/contact/contact.component";

const APP_ROUTES: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'curriculum', component: CurriculumComponent },
    { path: 'projects', component: ProjectsComponent },
    { path: 'blog', component: BlogComponent },
    { path: 'contact', component: ContactComponent },
    { path: '**', pathMatch: 'full', redirectTo:'home'}
];

export const APP_ROUTING = RouterModule.forRoot(APP_ROUTES);