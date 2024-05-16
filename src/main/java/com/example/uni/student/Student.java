package com.example.uni.student;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private String campusMail;
    private LocalDate date;
    private int age;

    public Student() {
    }

    public Student(int id, String name, String campusMail, LocalDate date, int age) {
        this.id = id;
        this.name = name;
        this.campusMail = campusMail;
        this.date = date;
        this.age = age;
    }



    public Student(String name, String campusMail, LocalDate date, int age) {
        this.name = name;
        this.campusMail = campusMail;
        this.date = date;
        this.age = age;
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
        return age;
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

    public void setAge(int age) {
        this.age = age;
    }
}
