package com.dongyang.ezRun.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
//@Table(name="runlog")
public class RunLog {
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
}
