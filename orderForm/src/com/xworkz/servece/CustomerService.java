package com.xworkz.servece;

import com.xworkz.dto.CustomerDTO;

public interface CustomerService {
     String validation(CustomerDTO customerDTO);

     default  CustomerDTO searchAll(int Id){
          return null;
     }
}
