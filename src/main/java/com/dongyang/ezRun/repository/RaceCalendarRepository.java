package com.dongyang.ezRun.repository;

import com.dongyang.ezRun.entity.RaceCalendar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceCalendarRepository extends CrudRepository<RaceCalendar, Integer> {
}
