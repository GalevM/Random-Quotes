import { Component, inject, OnInit, Renderer2 } from '@angular/core';
import { QuoteService } from '../quote.service';
import { Quote } from '../quote';

@Component({
  selector: 'app-quotes',
  imports: [],
  templateUrl: './quotes.component.html',
  styleUrl: './quotes.component.css'
})
export class QuotesComponent implements OnInit{

  service = inject(QuoteService);

  quote: Quote | undefined;
  

  constructor(private renderer: Renderer2) {
    console.log('QuotesComponent constructor');
  }

  ngOnInit(): void {
    this.service.getQuoteAsync()
    .subscribe((quote) => {
      this.quote = quote;
    });

    this.changeBackground();
  }

  onNew(){
    this.service.getQuoteAsync()
    .subscribe((quote) => {
      this.quote = quote;
    });

    this.changeBackground();
  }

  changeBackground(){
    const letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
      color += letters[Math.floor(Math.random() * 16)];
    }

    this.renderer.setStyle(document.body, 'backgroundColor', color);
  }

}
