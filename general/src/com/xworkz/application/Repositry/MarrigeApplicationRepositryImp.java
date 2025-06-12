package com.xworkz.application.Repositry;

import com.xworkz.application.DTO.marriageApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MarrigeApplicationRepositryImp implements MarriageApplicationRepositry{
    @Override
    public void save(marriageApplicationDTO marriageApplicationDTO) {
        System.out.println("Dry Testing For the Marriage Application Repository");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String password="9353193240";
           Connection connection= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
