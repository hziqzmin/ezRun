package com.dongyang.ezRun.controller;

import com.dongyang.ezRun.entity.PbTracker;
import com.dongyang.ezRun.repository.PbTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    PbTrackerRepository pbTrackerRepository;

    @GetMapping("/")
    public String home(Model model){

        List<PbTracker> pbTrackerEntityList =(List<PbTracker>) pbTrackerRepository.findAll();
        String[] quotes = {
                "\"The miracle isn't that I finished. The miracle is that I had the courage to start.\" — John Bingham",
                "\"Run when you can, walk if you have to, crawl if you must; just never give up.\" — Dean Karnazes",
                "\"Running is not about being better than someone else. It's about being better than you used to be.\" — Unknown",
                "\"Running reminds you that even in your weakest moments, you are strong.\" — Unknown",
                "\"I run because somehow completely exhausting myself is the most relaxing part of my day.\" — Unknown",
                "\"I trained 4 years to run only 9 seconds. There are people who do not see results in two months, give up and quit.\" — Usain Bolt",
                "\"Pain is inevitable. Suffering is optional.\" — Unknown",
                "\"Hills don’t go away. They wait.\" — Unknown",
                "\"Just stick with it. What seems hard now will one day be your warm-up.\" — Unknown",
                "\"I often hear someone say I’m not a real runner. We are all runners, some just run faster than others. I’ve never met a fake runner.\" — Unknown"
        };
        int randInt = (int) (Math.random() * quotes.length);
        model.addAttribute("userName", "Haziq");
        model.addAttribute("pbTracker", pbTrackerEntityList);
        model.addAttribute("randomQuote", quotes[randInt]);
        return "home";
    }
}
