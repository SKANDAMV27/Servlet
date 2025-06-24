package com.xworkz.servece;

import com.xworkz.dto.CustomerDTO;

public class CustomerServiceImplementation implements CustomerService{
    @Override
    public String Validation(CustomerDTO customerDTO) {
        System.out.println("Customer Service Validiation");
        return "false";
    }

}
