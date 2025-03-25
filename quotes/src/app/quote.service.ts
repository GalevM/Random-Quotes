import { inject, Injectable } from "@angular/core";
import { Quote } from "./quote";
import { HttpClient } from "@angular/common/http";

@Injectable({
    providedIn: 'root'
})
export class QuoteService {
    http = inject(HttpClient);
    constructor() { 
        console.log('QuoteService constructor');
    }

    getQuoteAsync() {
        return this.http.get<Quote>('api/quotes');
    }
}