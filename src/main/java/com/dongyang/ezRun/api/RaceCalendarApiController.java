/*
package com.dongyang.ezRun.api;

import com.dongyang.ezRun.entity.RaceCalendar;
import com.dongyang.ezRun.repository.RaceCalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/events")
public class RaceCalendarApiController {

    @Autowired
    private RaceCalendarRepository raceCalendarRepository;

    @GetMapping
    public List<Map<String, Object>> getEvents() {
        return raceCalendarRepository.findAll().stream().map(e -> {
            Map<String, Object> map = new HashMap<>();
            map.put("title", e.getRace_event());
            map.put("start", e.getRace_date());
            return map;
        }).collect(Collectors.toList());
    }

    @PostMapping
    public RaceCalendar addEvent(@RequestBody RaceCalendar event) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        event.setCreated_at(now);
        event.setUpdated_at(now);
        return raceCalendarRepository.save(event);
    }
}
*/
