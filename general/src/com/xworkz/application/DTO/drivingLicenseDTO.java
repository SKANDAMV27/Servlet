package com.xworkz.application.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

public class drivingLicenseDTO implements Serializable {
    private String name;
    private String address;
    private LocalDateTime date;
    private long mobile;
    private String type;

    public drivingLicenseDTO(){
        System.out.println("No-args Constructor That Created by The Tomcat");
    }

    public drivingLicenseDTO(String name, String address, String type, LocalDateTime date, long mobile) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.date = date;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "drivingLicenseDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                ", mobile=" + mobile +
                ", type='" + type + '\'' +
                '}';
    }
}
