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

        SignUpService signUpService = new SignUpServiceImp();

        boolean result = signUpService.checkValidation(Integer.parseInt(userId), password);

        if(result){
            String erro7="valid User Id and password";
            req.setAttribute("erro7",erro7);
            req.setAttribute("dto",signUpDTO);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Display.jsp");
            requestDispatcher.forward(req,resp);
        }else {
            String error8 ="Invalid User Id and password.";
            req.setAttribute("error8",error8);
            req.setAttribute("dto",signUpDTO);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("signIn.jsp");
            requestDispatcher.forward(req,resp);
        }



    }
}
