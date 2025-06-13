package com.xworkz.application.DTO;

import java.io.Serializable;

public class passportDTO implements Serializable {
    private String name;
    private long aadhar;
    private String address;
    private String panNo;
    private String country;
    private String state;
    private String city;
    private int pincode;
    private String passportType;
    private int referance;

    public passportDTO(){
        System.out.println("The Constructor Can Be Created by The Tomcat");
    }

    public passportDTO(String name, int aadhar, String address, int referance, String panNo, String country, String state, String city, int pincode, String passportType) {
        this.name = name;
        this.aadhar = aadhar;
        this.address = address;
        this.referance = referance;
        this.panNo = panNo;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.passportType = passportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAadhar() {
        return aadhar;
    }

    public void setAadhar(long aadhar) {
        this.aadhar = aadhar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }
    public int getReferance(){
        return referance;
    }
    public void setReferance(int referance){
        this.referance=referance;
    }

    @Override
    public String toString() {
        return "passportDTO{" +
                "name='" + name + '\'' +
                ", aadhar=" + aadhar +
                ", address='" + address + '\'' +
                ", panNo='" + panNo + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                ", passportType='" + passportType + '\'' +
                ", referance=" + referance +
                '}';
    }
}
