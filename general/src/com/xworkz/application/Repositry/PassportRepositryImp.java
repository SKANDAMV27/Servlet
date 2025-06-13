package com.xworkz.application.Repositry;

import com.xworkz.application.DTO.passportDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PassportRepositryImp implements PassportRepositry{
    @Override
    public void save(passportDTO passportDTO) {
        System.out.println("Dry Testing For The Passport Repositry.....");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/generaldb";
            String username = "root";
            String password = "9353193240";
            Connection connection=DriverManager.getConnection(url,username,password);
            String sql = "Insert Into passport_details values(0,'"+passportDTO.getName()+"','"+passportDTO.getAadhar()+"','"+passportDTO.getAddress()+"','"+passportDTO.getPanNo()+"','"+passportDTO.getCountry()+"','"+passportDTO.getCity()+"','"+passportDTO.getPincode()+"','"+passportDTO.getPassportType()+"','"+passportDTO.getReferance()+"','"+passportDTO.getState()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
