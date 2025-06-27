package com.xworkz.login.service;

import com.xworkz.login.dto.SignUpDTO;

import java.sql.SQLException;

public interface SignUpService {
    String validation(SignUpDTO signUpDTO) throws SQLException, ClassNotFoundException;

    boolean checkValidation(int userId , String password);

    public boolean checkEmailValidiation(String email);

    public String setPasswordValidation(String password, String conformPassword) throws SQLException, ClassNotFoundException;
}
