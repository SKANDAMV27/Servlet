package com.xworkz.login.repository;

import com.xworkz.login.dto.SignUpDTO;

import java.sql.*;

public class SignUpRepositryImp implements SignUpRepositry{
    @Override
    public void save(SignUpDTO signUpDTO) throws ClassNotFoundException, SQLException {
        System.out.println("Dry Testing.........................");


        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/formdb";
        String user = "root";
        String password = "9353193240";

        Connection connection =DriverManager.getConnection(url,user,password);

        String sql = "Insert into login_details(email,user_Id,password,conform_password) values(?,?,?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1, signUpDTO.getEmail());
        preparedStatement.setInt(2,signUpDTO.getUserId());
        preparedStatement.setString(3, signUpDTO.getPassword());
        preparedStatement.setString(4, signUpDTO.getConformPassword());

        preparedStatement.executeUpdate();
    }

    @Override
    public boolean existingUserID(int userId) {

        System.out.println("Existing Email Id");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/formdb";
            String user = "root";
            String password = "9353193240";

            Connection connection = DriverManager.getConnection(url,user,password);
            String sql = "select user_Id from login_details where user_Id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,userId);
            ResultSet resultSet= preparedStatement.executeQuery();
            if(resultSet.next()){
                System.out.println("UserId Is already Existed");
                return true;
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public boolean existingEmail(String email) throws ClassNotFoundException {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/formdb";
            String user = "root";
            String password = "9353193240";
            Connection connection=DriverManager.getConnection(url,user,password);
            String sql = "Select email from login_details where email=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                System.out.println("Email Is already Existed");
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;

    }

    @Override
    public boolean validateLogi(int userId, String password) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/formdb";
            String user = "root";
            String pasword = "9353193240";
            Connection connection=DriverManager.getConnection(url,user,pasword);
            String sql ="select user_Id from login_details where user_Id=? AND password=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,userId);
            preparedStatement.setString(2,password);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                System.out.println("Invalid User Id");
                return true;
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean validateLogin(int userId, String password) {
        return false;
    }


}




