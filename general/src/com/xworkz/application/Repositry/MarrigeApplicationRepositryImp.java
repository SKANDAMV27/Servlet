package com.xworkz.application.Repositry;

import com.xworkz.application.DTO.marriageApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
           String sql = "Insert Into marriage_details values(0,'"+marriageApplicationDTO.getGrowName()+"','"+marriageApplicationDTO.getBrideName()+"','"+marriageApplicationDTO.getLocation()+"','"+marriageApplicationDTO.getAddress()+"','"+marriageApplicationDTO.getRelesion()+"','"+marriageApplicationDTO.getDate()+"','"+marriageApplicationDTO.getWitness()+"','"+marriageApplicationDTO.getWitness1()+"','"+marriageApplicationDTO.getOfficer()+"')";
           Statement statement = connection.createStatement();
           statement.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
