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
@Table(name="racecalendar")
public class RaceCalendar {
    @Id
    @GeneratedValue
    private Integer cal_id;
    @Column
    private Long user_id;
    @Column
    private String race_event;
    @Column
    private String race_date;
    @Column
    private String location;
    @Column
    private String category;
    @Column
    private Boolean is_virtual;
    @Column
    private String notes;
    @Column
    private Timestamp created_at;
    @Column
    private Timestamp updated_at;

    public Integer getCal_id() {
        return cal_id;
    }
    public Long getUser_id() {
        return user_id;
    }
    public String getRace_event() {
        return race_event;
    }
    public String getRace_date() {
        return race_date;
    }
    public String getLocation() {
        return location;
    }
    public String getCategory() {
        return category;
    }
    public Boolean getIs_virtual() {
        return is_virtual;
    }
    public String getNotes() {
        return notes;
    }
    public Timestamp getCreated_at() {
        return created_at;
    }
    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setIs_virtual(Boolean is_virtual) {
        this.is_virtual = is_virtual;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setRace_date(String race_date) {
        this.race_date = race_date;
    }
    public void setRace_event(String race_event) {
        this.race_event = race_event;
    }
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public void setCal_id(Integer cal_id) {
        this.cal_id = cal_id;
    }

    public void calendarDetails(RaceCalendar racecalendar){
        if(racecalendar.cal_id != null){
            this.cal_id = racecalendar.cal_id;
        }
        if(racecalendar.user_id != null){
            this.user_id = racecalendar.user_id;
        }
        if(racecalendar.race_event != null){
            this.race_event = racecalendar.race_event;
        }
        if(racecalendar.race_date != null){
            this.race_date = racecalendar.race_date;
        }
        if(racecalendar.location != null){
            this.location = racecalendar.location;
        }
        if(racecalendar.category != null){
            this.category = racecalendar.category;
        }
        if(racecalendar.is_virtual != null){
            this.is_virtual = racecalendar.is_virtual;
        }
        if(racecalendar.notes != null){
            this.notes = racecalendar.notes;
        }
        if(racecalendar.created_at != null){
            this.created_at = racecalendar.created_at;
        }
        if(racecalendar.updated_at != null){
            this.updated_at = racecalendar.updated_at;
        }
    }
}
