package com.sorsix.apirandomquote;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/quotes")
public class QuotesAPI {

    List<Quote> quotes = new ArrayList<>();

    public QuotesAPI() {
        quotes.add(new Quote(1, "We must believe that we are gifted for something, and that this thing, at whatever cost, must be attained.", "Marie Curie"));
        quotes.add(new Quote(2, "We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light.", "Plato"));
        quotes.add(new Quote(3, "Life is 10% what happens to me and 90% of how I react to it.", "Charles Swindoll"));
        quotes.add(new Quote(4, "Start where you are. Use what you have. Do what you can.", "Arthur Ashe"));
        quotes.add(new Quote(5, "There are no traffic jams along the extra mile.", "Roger Staubach"));
        quotes.add(new Quote(6, "You take your life in your own hands, and what happens? A terrible thing, no one to blame.", "Erica Jong"));
        quotes.add(new Quote(7, "We must balance conspicuous consumption with conscious capitalism.", "Kevin Kruse"));
        quotes.add(new Quote(8, "Few things can help an individual more than to place responsibility on him, and to let him know that you trust him.", "Booker T. Washington"));
        quotes.add(new Quote(9, "When one door of happiness closes, another opens, but often we look so long at the closed door that we do not see the one that has been opened for us.", "Helen Keller"));
        quotes.add(new Quote(10, "If you do what you’ve always done, you’ll get what you’ve always gotten.", "Tony Robbins"));
        quotes.add(new Quote(11, "Fall seven times and stand up eight.", "Japanese Proverb"));
        quotes.add(new Quote(12, "Go confidently in the direction of your dreams. Live the life you have imagined.", "Henry David Thoreau"));
        quotes.add(new Quote(13, "Teach thy tongue to say, “I do not know,” and thous shalt progress.", "Maimonides"));
        quotes.add(new Quote(14, "Either write something worth reading or do something worth writing.", "Benjamin Franklin"));
        quotes.add(new Quote(15, "I’ve missed more than 9000 shots in my career. I’ve lost almost 300 games. 26 times I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life. And that is why I succeed.", "Michael Jordan"));
    }

    @GetMapping
    public Quote getRandomQuote(){
        Random RANDOM = new Random();
        return quotes.get(RANDOM.nextInt(15));
    }
}
