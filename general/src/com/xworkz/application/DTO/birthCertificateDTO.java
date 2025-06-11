package com.xworkz.application.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class birthCertificateDTO implements Serializable {
    private int Id;
    private String name;
    private String father;
    private String mother;
    private LocalDateTime date;
    private String Doctor;
    private String nurse;
    private String hospital;

    public birthCertificateDTO(){
        System.out.println("No-args Constructor That Created by the TomCat");
    }

    public birthCertificateDTO(int id, String name, String hospital, String nurse, String doctor, String father, String mother, LocalDateTime date) {
        Id = id;
        this.name = name;
        this.hospital = hospital;
        this.nurse = nurse;
        Doctor = doctor;
        this.father = father;
        this.mother = mother;
        this.date = date;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date.atStartOfDay();
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "birthCertificateDTO{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", date=" + date +
                ", Doctor='" + Doctor + '\'' +
                ", nurse='" + nurse + '\'' +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}
