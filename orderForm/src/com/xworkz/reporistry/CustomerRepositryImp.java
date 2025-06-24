package com.xworkz.reporistry;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.xworkz.dto.CustomerDTO;

import java.sql.*;

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

//            String sql = "Insert Into order_form values(0,'"+customerDTO.getName()+"','"+customerDTO.getEmail()+"','"+customerDTO.getMobile()+"','"+customerDTO.getHouse()+"','"+customerDTO.getArea()+"','"+customerDTO.getCity()+"','"+customerDTO.getPincode()+"','"+customerDTO.getDate()+"')";
//            Statement statement = connection.createStatement();
//            statement.executeUpdate(sql);
            String sql="Insert Into order_form values(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,customerDTO.getName());
            preparedStatement.setString(3, customerDTO.getEmail());
            preparedStatement.setDouble(4,customerDTO.getMobile());
            preparedStatement.setString(4,customerDTO.getHouse());
            preparedStatement.setString(5, customerDTO.getArea());
            preparedStatement.setString(6,customerDTO.getCity());
            preparedStatement.setDouble(7,customerDTO.getPincode());
            preparedStatement.setDate(8,customerDTO.getDate());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
