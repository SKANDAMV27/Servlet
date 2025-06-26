package com.xworkz.login.repository;

import com.xworkz.login.dto.SignUpDTO;

import java.sql.SQLException;

public interface SignUpRepositry {
        public void save(SignUpDTO signUpDTO) throws ClassNotFoundException, SQLException;

        public boolean existingUserID(int userId);

        public boolean existingEmail(String email) throws ClassNotFoundException;

        public boolean validateLogi(int userId,String password);


        boolean validateLogin(int userId, String password);
}
