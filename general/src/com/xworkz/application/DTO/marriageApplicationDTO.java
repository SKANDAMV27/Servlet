package com.xworkz.application.DTO;

import java.io.Serializable;
import java.time.LocalDate;

public class marriageApplicationDTO implements Serializable {
    private String growName;
    private String brideName;
    private String location;
    private String address;
    private String relesion;
    private LocalDate date;
    private String witness;
    private String witness1;
    private  String officer;

    public marriageApplicationDTO(){
        System.out.println("no-args Constructor That Created By The Constructor");
    }

    public marriageApplicationDTO(String growName, String brideName, String officer, String location, String address, String witness1, String relesion, LocalDate date, String witness) {
        this.growName = growName;
        this.brideName = brideName;
        this.officer = officer;
        this.location = location;
        this.address = address;
        this.witness1 = witness1;
        this.relesion = relesion;
        this.date = date;
        this.witness = witness;
    }

    public String getBrideName() {
        return brideName;
    }

    public void setBrideName(String brideName) {
        this.brideName = brideName;
    }

    public String getGrowName() {
        return growName;
    }

    public void setGrowName(String growName) {
        this.growName = growName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public String getWitness1() {
        return witness1;
    }

    public void setWitness1(String witness1) {
        this.witness1 = witness1;
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getRelesion() {
        return relesion;
    }

    public void setRelesion(String relesion) {
        this.relesion = relesion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
