package com.xworkz.login.servlet;

import com.xworkz.login.dto.SignUpDTO;
import com.xworkz.login.service.SignUpService;
import com.xworkz.login.service.SignUpServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/conform")
public class conformPassword extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=   req.getParameter("emailEmail");


        SignUpDTO signUpDTO = new SignUpDTO();
        signUpDTO.setEmail(email);

        SignUpService signUpService = new SignUpServiceImp();
        boolean result=signUpService.checkEmailValidiation(email);

        if(result){
            System.out.println("Invalid Email Id...");
            String err11 = "In Valid Email Id";
            req.setAttribute("err11",err11);
            req.setAttribute("dto",signUpDTO);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("forgetPassword.jsp");
            requestDispatcher.forward(req,resp);
        }else {
            System.out.println("Valid Email Id..................");
            String err10 = "Valid Email Id";
            req.setAttribute("err10",err10);
            req.setAttribute("dto",signUpDTO);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("passWorldSet.jsp");
            requestDispatcher.forward(req,resp);

        }
    }
}
