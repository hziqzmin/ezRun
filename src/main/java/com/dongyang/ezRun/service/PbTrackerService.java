package com.dongyang.ezRun.service;

import com.dongyang.ezRun.entity.PbTracker;
import com.dongyang.ezRun.repository.PbTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PbTrackerService {
    @Autowired
    PbTrackerRepository pbTrackerRepository;

    public List<PbTracker> index() {
        return (List<PbTracker>) pbTrackerRepository.findAll();
    }

    public PbTracker show(Integer id) {return pbTrackerRepository.findById(id).orElse(null); }
}
