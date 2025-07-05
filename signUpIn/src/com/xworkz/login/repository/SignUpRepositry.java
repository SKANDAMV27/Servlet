package com.xworkz.login.repository;

import com.xworkz.login.dto.SignUpDTO;

import java.sql.SQLException;
import java.util.Collection;


public interface SignUpRepositry {
    void save(SignUpDTO signUpDTO) throws ClassNotFoundException, SQLException;

    boolean existingUserID(int userId);

    boolean existingEmail(String email) throws ClassNotFoundException;

    boolean validateLogi(int userId, String password);


    void updatePassword(String email, String password);

    boolean conformValidiation(String email);

    Collection<SignUpDTO> fetchAll();


}
