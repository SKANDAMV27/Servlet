package com.xworkz.login.repository;

import com.xworkz.login.dto.SignUpDTO;

import java.sql.SQLException;

public interface SignUpRepositry {
        public void save(SignUpDTO signUpDTO) throws ClassNotFoundException, SQLException;
}
