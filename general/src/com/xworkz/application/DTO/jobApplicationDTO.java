package com.xworkz.application.DTO;

import java.io.Serializable;

public class jobApplicationDTO implements Serializable {
    private String name;
    private String email;
    private String education;
    private String skills;
    private long salary;
    private String experence;

    public jobApplicationDTO(){
        System.out.println("This is an DTO Constructor That Created by TOMCAT");
    }

    public jobApplicationDTO(String email, String name, String education, String skills, long salary, String experence) {
        this.email = email;
        this.name = name;
        this.education = education;
        this.skills = skills;
        this.salary = salary;
        this.experence = experence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getExperence() {
        return experence;
    }

    public void setExperence(String experence) {
        this.experence = experence;
    }

    @Override
    public String toString() {
        return "jobApplicationDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", skills='" + skills + '\'' +
                ", salary=" + salary +
                ", experence='" + experence + '\'' +
                '}';
    }
}
