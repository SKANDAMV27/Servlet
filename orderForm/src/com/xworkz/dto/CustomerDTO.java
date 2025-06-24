package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CustomerDTO implements Serializable {
    private String name;
    private String email;
    private long mobile;
    private String house;
    private String area;
    private String city;
    private long pincode;
    private LocalDate date;

    public CustomerDTO(){
        System.out.println("No args Customer DTO Constructor........");
    }

    public CustomerDTO(String name, String email, long mobile, String house, String area, String city, long pincode, LocalDate date) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.house = house;
        this.area = area;
        this.city = city;
        this.pincode = pincode;
        this.date = date;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public double getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", house='" + house + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                ", date=" + date +
                '}';
    }
}
