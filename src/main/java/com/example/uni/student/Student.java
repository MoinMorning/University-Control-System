package com.example.uni.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize =  1
    )
    @GeneratedValue(
            strategy   = GenerationType.SEQUENCE,
            generator   = "student_sequence"
    )
    private int id;
    private String name;
    private String campusMail;
    private LocalDate date;
    @Transient
    private int age;

    public Student() {
    }

    public Student(int id, String name, String campusMail, LocalDate date) {
        this.id = id;
        this.name = name;
        this.campusMail = campusMail;
        this.date = date;
    }



    public Student(String name, String campusMail, LocalDate date) {
        this.name = name;
        this.campusMail = campusMail;
        this.date = date;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCampusMail() {
        return campusMail;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAge() {
        return Period.between(this.date,LocalDate.now()).getYears();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCampusMail(String campusMail) {
        this.campusMail = campusMail;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
