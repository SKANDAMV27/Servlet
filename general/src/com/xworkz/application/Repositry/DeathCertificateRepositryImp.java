package com.xworkz.application.Repositry;

import com.xworkz.application.DTO.deathCertificateDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeathCertificateRepositryImp implements DeathCertificateRepositry{
    @Override
    public void save(deathCertificateDTO deathCertificateDTO) {
        System.out.println("Dry Test For The Death Certificate Repositry..........");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String passward="9353193240";
            Connection connection=DriverManager.getConnection(url,username,passward);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
