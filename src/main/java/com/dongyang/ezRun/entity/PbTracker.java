package com.dongyang.ezRun.entity;

import jakarta.persistence.*;
import lombok.*;

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
    private Integer id;
    @Column
    private String category;
    @Column
    private String timing;
    @Column
    private String race_event;
    @Column
    private String race_date;

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
    }
}
