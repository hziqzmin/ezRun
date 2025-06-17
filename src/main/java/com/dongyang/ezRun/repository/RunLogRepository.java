package com.dongyang.ezRun.repository;

import com.dongyang.ezRun.entity.RunLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunLogRepository extends CrudRepository<RunLog, Integer> {
}
