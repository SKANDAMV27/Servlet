package com.xworkz.login.repository;

import com.xworkz.login.dto.SignUpDTO;

import java.sql.*;

public class SignInRepositryImp implements SignInRepositry{

    @Override
    public boolean check(int userId, String passWord) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/formdb";
            String userName = "root";
            String password = "9353193240";
            Connection connection=DriverManager.getConnection(url,userName,password);

            String sql ="select * from login_details where user_id =? and password=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1, (userId));
            preparedStatement.setString(2,passWord);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
