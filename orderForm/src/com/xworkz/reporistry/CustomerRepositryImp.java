package com.xworkz.reporistry;

import com.xworkz.dto.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
            String sql="Insert Into order_form (name, email, mobile, house, area, city, pincode, date)  values(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,customerDTO.getName());
            preparedStatement.setString(2, customerDTO.getEmail());
            preparedStatement.setDouble(3,customerDTO.getMobile());
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

    @Override
    public List<CustomerDTO> findAll(int id) throws ClassNotFoundException, SQLException {
        return List.of();
    }


    @Override
    public List<CustomerDTO> findAll() throws ClassNotFoundException, SQLException {
        List<CustomerDTO> customerDTOS = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/formbd";
            String user = "root";
            String password ="9353193240";
            Connection connection = DriverManager.getConnection(url,user,password);

            String sql = "select * from order_form";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                String email=resultSet.getString(3);
                long mobile= (long) resultSet.getLong(4);
                String house = resultSet.getString(5);
                String area = resultSet.getString(6);
                String city = resultSet.getString(7);
                Long pincode = resultSet.getLong(8);
                //LocalDate date = resultSet.getDate(9).toLocalDate();

                CustomerDTO customerDTO = new CustomerDTO();
                customerDTO.setName(name);
                customerDTO.setEmail(email);
                customerDTO.setMobile(Long.parseLong(String.valueOf(mobile)));
                customerDTO.setHouse(house);
                customerDTO.setArea(area);
                customerDTO.setCity(city);
                customerDTO.setPincode(pincode);
                //customerDTO.setDate(Date.valueOf(LocalDate.parse(date)));

            }

         return customerDTOS;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
