package com.xworkz.login.repository;

import com.xworkz.login.dto.SignUpDTO;

import java.sql.SQLException;

public interface SignUpRepositry {
        public void save(SignUpDTO signUpDTO) throws ClassNotFoundException, SQLException;

        public boolean existingUserID(int userId);

        public boolean existingEmail(String email) throws ClassNotFoundException;

        public boolean validateLogi(int userId,String password);


       public boolean validateLogin(int userId, String password);

        //public boolean conformValidiation(String email);

        public  boolean restPasswordValidiation(String password, String email,String conformPassword);

    boolean conformValidiation(String email, String password, String conformPassword);

    boolean conformValidiation(String email);
}
