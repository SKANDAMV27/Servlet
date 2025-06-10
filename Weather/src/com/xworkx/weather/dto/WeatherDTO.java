package com.xworkx.weather.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class WeatherDTO implements Serializable {

    private String location;
    private  String recordedBy;
    private LocalDate date;
    private int temperature;

    public WeatherDTO(){
        System.out.println("no args const of Westher dto");
    }


    public int getTemperature() {
        return temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getRecordedBy() {
        return recordedBy;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRecordedBy(String recordedBy) {
        this.recordedBy = recordedBy;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
