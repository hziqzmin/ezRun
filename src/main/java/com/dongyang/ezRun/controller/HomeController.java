package com.dongyang.ezRun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        String[] quotes = {
                "The miracle isn't that I finished. The miracle is that I had the courage to start.— John Bingham",
                "Run when you can, walk if you have to, crawl if you must; just never give up.— Dean Karnazes",
                "Running is not about being better than someone else. It's about being better than you used to be.— Unknown",
                "Running reminds you that even in your weakest moments, you are strong. — Unknown",
                "I run because somehow completely exhausting myself is the most relaxing part of my day. — Unknown"
        };
        int randInt = (int) (Math.random() * quotes.length);
        model.addAttribute("randomQuote", quotes[randInt]);
        return "home";
    }
}
