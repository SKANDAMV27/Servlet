package com.xworkz.servlet;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.reporistry.CustomerRepositry;
import com.xworkz.reporistry.CustomerRepositryImp;
import com.xworkz.servece.CustomerService;
import com.xworkz.servece.CustomerServiceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =req.getParameter("nameName");
        String email=req.getParameter("emailEmail");
        String mobile=req.getParameter("mobileMobile");
        String house=req.getParameter("houseHouse");
        String area=req.getParameter("areaArea");
        String city=req.getParameter("cityCity");
        String pincode=req.getParameter("pincodePincode");
        String date=req.getParameter("dateDate");

        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setName(name);
        customerDTO.setEmail(email);
        customerDTO.setMobile(Long.parseLong(mobile));
        customerDTO.setHouse(house);
        customerDTO.setArea(area);
        customerDTO.setCity(city);
        customerDTO.setPincode(Long.parseLong(pincode));
        customerDTO.setDate(LocalDate.parse(date));

        System.out.println(customerDTO);

        req.setAttribute("customerDTO",customerDTO);

        CustomerService customerService = new CustomerServiceImplementation();
        customerService.Validation(customerDTO);

        System.out.println(customerService);

        CustomerRepositry customerRepositry = new CustomerRepositryImp();
        customerRepositry.Save(customerDTO);

        System.out.println(customerRepositry);




    }
}
