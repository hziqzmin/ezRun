package com.dongyang.ezRun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class WeeklyTrainingPlanController {
    @GetMapping("/weeklyTrainingPlan")
    public String weeklyTrainingPlan(Model model) {

        return "weeklyTrainingPlan";
    }
}
