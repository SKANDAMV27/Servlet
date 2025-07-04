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
import javax.servlet.http.HttpSession;
import javax.xml.transform.Result;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/ResetPassword")
public class ResetPassword extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String password = req.getParameter("passworPassword");
        String conformPassword = req.getParameter("passworConform");
        HttpSession session=req.getSession();
        String email=(String) session.getAttribute("email");
        System.out.println("servlet email"+email);

        SignUpDTO signUpDTO = new SignUpDTO();
        signUpDTO.setPassword(password);
        signUpDTO.setConformPassword(conformPassword);

        SignUpService signUpService = new SignUpServiceImp();
        if (signUpService.resetPassword(email,password,conformPassword)){
            System.out.println("password matched");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("signIn.jsp");
            requestDispatcher.forward(req,resp);
        }
        else {
            String error="password doest match";
            req.setAttribute("error",error);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("passWorldSet.jsp");
            requestDispatcher.forward(req,resp);
        }

    }

}
