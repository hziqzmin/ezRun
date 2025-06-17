package com.dongyang.ezRun.dto;


import com.dongyang.ezRun.entity.RunLog;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RunLogDto {
    private Integer log_id;
    private Long user_id;
    private String run_title;
    private Date run_date;
    private Float run_distance;
    private String run_duration;
    private String run_type;
    private Integer avg_hr;
    private String avg_pace;
    private String notes;

    public RunLog toRunLog() {
        return new RunLog(log_id, user_id, run_title, run_date, run_distance,
                run_duration, run_type, avg_hr, avg_pace, notes);
    }
}
