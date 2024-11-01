package com.msp.movie.db.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long personId;

    private String first_name;

    private String last_name;

    private Date birth_date;

    private String gender;

    public Persons() {

    }

    public Long getPersonId() {
        return personId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public String getGender() {
        return gender;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
