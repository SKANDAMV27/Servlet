package com.xworkz.login.service;

import com.xworkz.login.dto.SignUpDTO;

import java.sql.SQLException;

public interface SignUpService {
    String validation(SignUpDTO signUpDTO) throws SQLException, ClassNotFoundException;

    boolean checkValidation(int userId, String password);

    boolean checkEmailValidiation(String email);


    boolean resetPassword(String email, String password, String conformPassword);
}
