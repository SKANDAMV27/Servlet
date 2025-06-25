package com.xworkz.reporistry;

import com.xworkz.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.List;

public interface CustomerRepositry {

    public void Save(CustomerDTO customerDTO);



    List<CustomerDTO>findAll(int id) throws ClassNotFoundException, SQLException;

    List<CustomerDTO> findAll() throws ClassNotFoundException, SQLException;
}
