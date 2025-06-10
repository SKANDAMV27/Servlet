package com.xworkz.application.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

public class deathCertificateDTO implements Serializable {
    private String name;
    private String cause;
    private LocalDateTime date;
    private int age;
    private String certified;
    private String hospital;
    private String death;
    private String gender;
    private String marks;

    public deathCertificateDTO(){
        System.out.println("The Constructor That Created By The Tomcat");
    }

    public deathCertificateDTO(String name, String cause, LocalDateTime date, int age, String certified, String hospital, String death, String gender, String marks) {
        this.name = name;
        this.cause = cause;
        this.date = date;
        this.age = age;
        this.certified = certified;
        this.hospital = hospital;
        this.death = death;
        this.gender = gender;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCertified() {
        return certified;
    }

    public void setCertified(String certified) {
        this.certified = certified;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }
}
