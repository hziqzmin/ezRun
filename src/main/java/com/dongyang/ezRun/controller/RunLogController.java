package com.dongyang.ezRun.controller;

import com.dongyang.ezRun.dto.RunLogDto;
import com.dongyang.ezRun.entity.RunLog;
import com.dongyang.ezRun.repository.RunLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RunLogController {
    @Autowired
    RunLogRepository runLogRepository;

    @GetMapping("/runLog")
    public String index(Model model) {
        List<RunLog> runLogEntityList=(List<RunLog>)runLogRepository.findAll();

        // Wrap with index manually if needed
        List<Map<String, Object>> indexedLogs = new ArrayList<>();
        for (int i = 0; i < runLogEntityList.size(); i++) {
            RunLog log = runLogEntityList.get(i);
            Map<String, Object> map = new HashMap<>();
            map.put("no", i + 1);
            map.put("log", log);
            indexedLogs.add(map);
        }

        model.addAttribute("runLogList", indexedLogs);
        return "runLogPages/runLog";
    }

    @GetMapping("/runLog/{log_id}")
    public String edit(@PathVariable Integer log_id, Model model) {
        RunLog runLogEntity=runLogRepository.findById(log_id).orElse(null);
        model.addAttribute("runLog", runLogEntity);
        return "runLogPages/runLogEdit";
    }

    @GetMapping("/runLog/add")
    public String add() {

        return "runLogPages/runLogAdd";
    }

    @GetMapping("/runLog/{log_id}/delete")
    public String delete(@PathVariable("log_id") Integer log_id, RedirectAttributes rttr) {
        RunLog target = runLogRepository.findById(log_id).orElse(null);
        if (target != null) {
            runLogRepository.delete(target);
            rttr.addFlashAttribute("msg", "Run log successfully deleted.");
        }
        return "redirect:/runLog";
    }

    @PostMapping("/runLog/createLog")
    public String newLog(RunLogDto newRunLog){
        RunLog runLog=newRunLog.toRunLog();
        runLogRepository.save(runLog);
        return "redirect:/runLog";
    }

    @PostMapping("/runLog/update")
    public String update(RunLogDto updateRunLog){
        RunLog runLog=updateRunLog.toRunLog();
        runLogRepository.save(runLog);
        return "redirect:/runLog";
    }
}
