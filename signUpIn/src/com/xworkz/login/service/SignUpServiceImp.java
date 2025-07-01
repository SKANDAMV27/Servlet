package com.xworkz.login.service;

import com.xworkz.login.dto.SignUpDTO;
import com.xworkz.login.repository.SignUpRepositry;
import com.xworkz.login.repository.SignUpRepositryImp;

import java.sql.SQLException;

public class SignUpServiceImp implements SignUpService {

    @Override
    public String validation(SignUpDTO signUpDTO) throws SQLException, ClassNotFoundException {
        SignUpRepositry signUpRepositry = new SignUpRepositryImp();
        System.out.println("Validiation.........................");
        String email = signUpDTO.getEmail();
        int userId = signUpDTO.getUserId();
        String password = signUpDTO.getPassword();
        String conformPassword = signUpDTO.getConformPassword();
        if (email == null || email.length() < 10 || !email.contains("@gmail.com")) {
            return "false";
        } else if (userId < 0) {
            return "falseuser";
        } else if (password == null || !password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$") || password.length() < 5) {
            return "invalid";
        } else if (conformPassword == null || !password.equals(conformPassword)) {
            return "conformInvalid";

        } else if (signUpRepositry.existingUserID(userId)) {
            return "existingUserId";
        } else if (signUpRepositry.existingEmail(email)) {
            return "existingEmail";

        } else {

            signUpRepositry.save(signUpDTO);
            return "true";

        }
    }

    @Override
    public boolean checkValidation(int userId, String password) {
        SignUpRepositry signUpRepositry = new SignUpRepositryImp();
        return signUpRepositry.validateLogi(userId,password);
    }

    @Override
    public boolean checkEmailValidiation(String email) {
        SignUpRepositry signUpRepositry = new SignUpRepositryImp();
        return signUpRepositry.conformValidiation(email);
    }

    @Override
    public String setPasswordValidation(String password, String conformPassword) throws SQLException, ClassNotFoundException {

        SignUpRepositry signUpRepositry = new SignUpRepositryImp();
        SignUpDTO signUpDTO = new SignUpDTO();
        String setPassword = signUpDTO.getPassword();
        if (setPassword == null || !password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$") || password.length() < 8) {
            System.out.println("Password Correct");
            return "Invalid Password";
        } else {
            signUpRepositry.save(signUpDTO);
            return "true";

        }

    }

    @Override
    public boolean checkEmailValidiation(String email, String password, String conformPassword) {
        return false;
    }

    @Override
    public boolean resetPassword(String email, String password, String conformPassword) {
        SignUpRepositry signUpRepositry = new SignUpRepositryImp();
        return signUpRepositry.conformValidiation(email,password,conformPassword);
    }
}