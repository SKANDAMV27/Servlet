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
import javax.xml.transform.Result;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/ResetPassword")
public class ResetPassword extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("emailEmail");
        String password = req.getParameter("passworPassword");
        String conformPassword = req.getParameter("passworConform");

        SignUpDTO signUpDTO = new SignUpDTO();
        signUpDTO.setEmail(email);
        signUpDTO.setPassword(password);
        signUpDTO.setConformPassword(conformPassword);


        System.out.println(signUpDTO);

        SignUpService signUpService = new SignUpServiceImp();
        try {
            String result=signUpService.setPasswordValidation(password,conformPassword);


            if(result.equals("Invalid Password"))
            {
                System.out.println("Password Dont match.");
                String erro12 = "password dont Match...";
                req.setAttribute("erro12",erro12);
                req.setAttribute("dto",signUpDTO);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("passWorldSet.jsp");
                requestDispatcher.forward(req,resp);

            }


            boolean update = signUpService.checkEmailValidiation(email,password,conformPassword);

            if(update){
                String error12 ="Sucessfullt Update The Password";
                req.setAttribute("error12",error12);
                req.setAttribute("dto",signUpDTO);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("signIn.jsp");
                requestDispatcher.forward(req,resp);
            }else{
                String error11 ="Some Error";
                req.setAttribute("error12",error11);
                req.setAttribute("dto",signUpDTO);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("passWorldSet.jsp");
                requestDispatcher.forward(req,resp);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }




    }

}
