package com.dongyang.ezRun.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="runlog")
public class RunLog {
    @Id
    @GeneratedValue
    private Integer log_id;
    @Column
    private Long user_id;
    @Column
    private String run_title;
    @Column
    private Date run_date;
    @Column
    private Float run_distance;
    @Column
    private String run_duration;
    @Column
    private String run_type;
    @Column
    private Integer avg_hr;
    @Column
    private String avg_pace;
    @Column
    private String notes;

    public String getId() {
        return log_id + "";
    }
}
