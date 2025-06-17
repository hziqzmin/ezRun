package com.dongyang.ezRun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RaceCalendarController {
    /*@Autowired
    private CalendarEventRepository repository;*/

    @GetMapping("/raceCalendar")
    public String raceCalendar() {
        return "raceCalendarPages/raceCalendar";
    }
}
