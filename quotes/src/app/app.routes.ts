import { Routes } from '@angular/router';
import { QuotesComponent } from './quotes/quotes.component';

export const routes: Routes = [
    { path: 'quotes', component: QuotesComponent },
    { path: '', redirectTo: '/quotes', pathMatch: 'full' },
    { path: '**', redirectTo: '/quotes' }
];
