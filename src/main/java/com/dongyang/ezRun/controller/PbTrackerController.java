package com.dongyang.ezRun.controller;

import com.dongyang.ezRun.entity.PbTracker;
import com.dongyang.ezRun.repository.PbTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PbTrackerController {
    @Autowired
    PbTrackerRepository pbTrackerRepository;

    @GetMapping("/pbTracker")
    public String showAllPb(Model model) {
        List<PbTracker> pbTrackerEntityList=(List<PbTracker>) pbTrackerRepository.findAll();

        List<List<PbTracker>> rows = new ArrayList<>();
        for (int i = 0; i < pbTrackerEntityList.size(); i += 2) {
            rows.add(pbTrackerEntityList.subList(i, Math.min(i + 2, pbTrackerEntityList.size())));
        }
        model.addAttribute("pbTracker", rows);
        return "/pbTrackerPages/pbTracker";
    }

    @GetMapping("/pbTracker/edit")
    public String showEditPage(Model model) {
        List<PbTracker> pbTrackerEntityList=(List<PbTracker>) pbTrackerRepository.findAll();

        List<List<PbTracker>> rows = new ArrayList<>();
        for (int i = 0; i < pbTrackerEntityList.size(); i += 2) {
            rows.add(pbTrackerEntityList.subList(i, Math.min(i + 2, pbTrackerEntityList.size())));
        }
        model.addAttribute("pbTracker", rows);
        return "/pbTrackerPages/pbTrackerEdit";
    }

    @PostMapping("/pbTracker/update")
    public String updateTiming(@RequestParam("idList") List<Integer> idList,
                                @RequestParam("timingList") List<String> timingList,
                                @RequestParam("raceEventList") List<String> raceEventList,
                                @RequestParam("raceDateList") List<String> raceDateList) {
        for (int i = 0; i < idList.size(); i++) {
            PbTracker pb = pbTrackerRepository.findById(idList.get(i)).orElse(null);
            if (pb != null) {
                pb.setTiming(timingList.get(i));  // stores "HH:mm:ss"
                pb.setRace_event(raceEventList.get(i));
                pb.setRace_date(raceDateList.get(i));
                pbTrackerRepository.save(pb);
            }
        }
        return "redirect:/pbTracker";
    }
}
