package com.xworkz.application.Repositry;

import com.xworkz.application.DTO.drivingLicenseDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DrivingLicienceRepositryImp implements DrivingLicenseRepositry{
    @Override
    public void save(drivingLicenseDTO drivingLicenseDTO) {
        System.out.println("Dry Test For Driving Licience Repositry..........");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String password="9353193240";
            Connection connection=DriverManager.getConnection(url,username,password);
            String sql = "Insert Into driving_licience_details values(0,'"+drivingLicenseDTO.getName()+"','"+drivingLicenseDTO.getAddress()+"','"+drivingLicenseDTO.getDate()+"','"+drivingLicenseDTO.getMobile()+"','"+drivingLicenseDTO.getType()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println(connection);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
