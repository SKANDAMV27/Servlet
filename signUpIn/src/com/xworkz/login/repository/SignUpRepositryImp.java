package com.xworkz.login.repository;

import com.xworkz.login.dto.SignUpDTO;

import java.sql.*;
import java.time.LocalDate;

public class SignUpRepositryImp implements SignUpRepositry{
    @Override
    public void save(SignUpDTO signUpDTO) throws ClassNotFoundException, SQLException {
        System.out.println("Dry Testing.........................");


        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/formdb";
        String user = "root";
        String password = "9353193240";

        Connection connection =DriverManager.getConnection(url,user,password);

        String sql = "Insert into login_details(email,user_Id,password,conform_password) values(?,?,?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1, signUpDTO.getEmail());
        preparedStatement.setInt(2,signUpDTO.getUserId());
        preparedStatement.setString(3, signUpDTO.getPassword());
        preparedStatement.setString(4, signUpDTO.getConformPassword());

        preparedStatement.executeUpdate();
    }
}
