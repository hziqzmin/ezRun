package com.dongyang.ezRun.repository;

import com.dongyang.ezRun.entity.PbTracker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PbTrackerRepository extends CrudRepository<PbTracker, Integer> {
}
