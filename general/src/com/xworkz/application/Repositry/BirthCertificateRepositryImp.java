package com.xworkz.application.Repositry;

import com.xworkz.application.DTO.birthCertificateDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BirthCertificateRepositryImp implements BirthCertificateRepositry{
    @Override
    public void save(birthCertificateDTO birthCertificateDTO) {
        System.out.println("Dry Running For Birth Certificate Application.........");

        try {
            //load & Register
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String password="9353193240";
            //Create a Connection
            Connection connection =DriverManager.getConnection(url,username,password);
            // Prepare The Statement
            String sql = "Insert into birth_certificate_details values(0,'"+birthCertificateDTO.getName()+"','"+birthCertificateDTO.getFather()+"','"+birthCertificateDTO.getMother()+"','"+birthCertificateDTO.getDate()+"','"+birthCertificateDTO.getDoctor()+"','"+birthCertificateDTO.getNurse()+"','"+birthCertificateDTO.getHospital()+"')";
            Statement statement=connection.createStatement();
            //Execute the Statement
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
