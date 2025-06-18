package com.xworkz.skanda.repositry;

import com.xworkz.skanda.dto.FormDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FormRepositryImpo implements FormRepositry{
    @Override
    public void save(FormDTO formDTO) {
        System.out.println("Dry Running For the Form.........");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/formdb";
            String user ="root";
            String password = "9353193240";
            Connection connection = DriverManager.getConnection(url,user,password);
            String sql = "Insert into form_details values(0,'"+formDTO.getName()+"','"+formDTO.getAge()+"','"+formDTO.getFather()+"','"+formDTO.getMother()+"','"+formDTO.getAdress()+"')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
