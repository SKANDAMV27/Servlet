package com.xworkz.login.dto;

import java.io.Serializable;

public class SignInDTO implements Serializable {
    private int userId;
    private String passWord;

    public SignInDTO(){
        System.out.println("No args SignIn Dto Constructor.........");
    }

    public SignInDTO(int userId, String passWord) {
        this.userId = userId;
        this.passWord = passWord;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "SignInDTO{" +
                "userId=" + userId +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
