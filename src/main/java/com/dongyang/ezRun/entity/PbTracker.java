package com.dongyang.ezRun.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="pbtracker")
public class PbTracker {
    @Id
    @GeneratedValue
    private Integer pb_id;
    @Column
    private Long user_id;
    @Column
    private String category;
    @Column
    private String timing;
    @Column
    private String race_event;
    @Column
    private String race_date;
    @Column
    private Timestamp created_at;
    @Column
    private Timestamp updated_at;

    public void pbDetails(PbTracker pbtracker){
        if(pbtracker.category != null){
            this.category = pbtracker.category;
        }
        if (pbtracker.timing != null) {
            this.timing = pbtracker.timing;
        }
        if (pbtracker.race_event != null) {
            this.race_event = pbtracker.race_event;
        }
        if (pbtracker.race_date != null) {
            this.race_date = pbtracker.race_date;
        }
        if(pbtracker.created_at != null){
            this.created_at = pbtracker.created_at;
        }
        if(pbtracker.updated_at != null){
            this.updated_at = pbtracker.updated_at;
        }
    }
}
