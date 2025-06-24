package com.xworkz.reporistry;

import com.xworkz.dto.CustomerDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerRepositryImp implements CustomerRepositry{
    @Override
    public void Save(CustomerDTO customerDTO) {
        System.out.println("Dry testing For The Customer DTO.............");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/formdb";
            String user = "root";
            String password ="9353193240";
            Connection connection =  DriverManager.getConnection(url,user,password);

            String sql = "Insert Into order_form values(0,'"+customerDTO.getName()+"','"+customerDTO.getEmail()+"','"+customerDTO.getMobile()+"','"+customerDTO.getHouse()+"','"+customerDTO.getArea()+"','"+customerDTO.getCity()+"','"+customerDTO.getPincode()+"','"+customerDTO.getDate()+"')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
