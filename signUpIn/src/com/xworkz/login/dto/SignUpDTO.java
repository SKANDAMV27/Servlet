package com.xworkz.login.dto;

import java.io.Serializable;

public class SignUpDTO implements Serializable {
    private String email;
    private int userId;
    private String password;
    private String conformPassword;

    public SignUpDTO(){
        System.out.println("No args Sign Up Constructor....");
    }
    public SignUpDTO(String email,int userId,String password,String conformPassword){
        this.email=email;
        this.userId=userId;
        this.password=password;
        this.conformPassword=conformPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getConformPassword() {
        return conformPassword;
    }

    public void setConformPassword(String conformPassword) {
        this.conformPassword = conformPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignUpDTO{" +
                "email='" + email + '\'' +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                ", EmailServlet='" + conformPassword + '\'' +
                '}';
    }
}
