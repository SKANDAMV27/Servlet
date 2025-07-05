package com.xworkz.login.servlet;

import com.xworkz.login.dto.SignUpDTO;
import com.xworkz.login.service.SignUpService;
import com.xworkz.login.service.SignUpServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DisplayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            SignUpService signUpService = new SignUpServiceImp();
            List<SignUpDTO> list = signUpService.fetchAll();
            req.setAttribute("display",list);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("SignIn.jsp");
            requestDispatcher.forward(req,resp);
        }
    }

