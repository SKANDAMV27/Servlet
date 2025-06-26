package com.xworkz.login.servlet;

import com.xworkz.login.dto.SignUpDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signIn")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId=req.getParameter("idID");
        String password=req.getParameter("passWord");

        SignUpDTO signUpDTO = new SignUpDTO();
        signUpDTO.setUserId(Integer.parseInt(userId));
        signUpDTO.setPassword(password);
        System.out.println(signUpDTO);



    }
}
