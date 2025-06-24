package com.xworkz.servece;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.reporistry.CustomerRepositry;
import com.xworkz.reporistry.CustomerRepositryImp;

public class CustomerServiceImplementation implements CustomerService{
    @Override
    public String validation(CustomerDTO customerDTO) {
        System.out.println("Customer Service Validation");
        if (customerDTO.getName()==null ||customerDTO.getName().length()<4 ||customerDTO.getName().length()>30){
            return "false";
        } else if (customerDTO.getEmail()==null || customerDTO.getEmail().equals("@")||customerDTO.getEmail().equals(".com")) {
            return "false";

        }
        CustomerRepositry customerRepositry=new CustomerRepositryImp();
        customerRepositry.Save(customerDTO);
        return "true";
    }

}
