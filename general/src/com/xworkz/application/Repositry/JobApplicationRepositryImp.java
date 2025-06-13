package com.xworkz.application.Repositry;

import com.xworkz.application.DTO.jobApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JobApplicationRepositryImp implements JobApplicationRepositry {
    @Override
    public void save(jobApplicationDTO jobDTO) {
        System.out.println("JOb Application Connection Repository Dry Running");

        {
            try {
                //Load & Register
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/generaldb";
                String username="root";
                String password="9353193240";
                //Create a Connection
                Connection connection=DriverManager.getConnection(url,username,password);
                //Prepare The Stataement

                String sql = "insert into job_application_details values(0,'"+jobDTO.getName()+"','"+jobDTO.getEmail()+"','"+jobDTO.getEducation()+"','"+jobDTO.getSkills()+"','"+jobDTO.getSalary()+"','"+jobDTO.getExperence()+"')";
                Statement statement=connection.createStatement();

                //Exectute The Statement

                statement.executeUpdate(sql);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
