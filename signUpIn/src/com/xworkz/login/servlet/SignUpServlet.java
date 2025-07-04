package com.xworkz.login.servlet;

import com.xworkz.login.dto.SignUpDTO;
import com.xworkz.login.service.SignUpService;
import com.xworkz.login.service.SignUpServiceImp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/signup" )
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("emaiEmail");
        String userId = req.getParameter("userUser");
        String password = req.getParameter("passwordPassword");
        String conformPassword = req.getParameter("conformConform");

        SignUpDTO signUpDTO = new SignUpDTO();
        signUpDTO.setEmail(email);
        signUpDTO.setUserId(Integer.parseInt(userId));
        signUpDTO.setPassword(password);
        signUpDTO.setConformPassword(conformPassword);

        System.out.println(signUpDTO);
        System.out.println("Data");

        SignUpService signUpService = new SignUpServiceImp();

        try {
            String result = signUpService.validation(signUpDTO);

            if(result.equals("false")){
                System.out.println("Invalid Valid Email ID............");
                String error="Email Id Is Not Correct";
                req.setAttribute("error",error);

            } else if (result.equals("falseuser")) {
                System.out.println("Invalid user Id ");
                String error1 = "user Id Must Be More than 0";
                req.setAttribute("error1",error1);
                req.setAttribute("dto",signUpDTO);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("signUp.jsp");
                requestDispatcher.forward(req,resp);
            } else if(result.equals("invalid")){
                System.out.println("Password Must Be 8 Characture");
                String error3 = "Password Must Be 8 Characture";
                req.setAttribute("error3",error3);
                req.setAttribute("dto",signUpDTO);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("signUp.jsp");
                requestDispatcher.forward(req,resp);

            } else if (result.equals("conformInvalid")) {
                System.out.println("Invalid Password.....");
                String error4 ="Mismatch Password";
                req.setAttribute("error4",error4);
                req.setAttribute("dto",signUpDTO);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("signUp.jsp");
                requestDispatcher.forward(req,resp);

            } else if (result.equals("existingUserId")) {
                System.out.println("User Id is Already Existed");
                String error5 ="User Id is already Existed";
                req.setAttribute("error5",error5);
                req.setAttribute("dto",signUpDTO);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("signUp.jsp");
                requestDispatcher.forward(req,resp);
            } else if (result.equals("existingEmail")) {
                System.out.println("Email Already Existed");
                String error6 = "Email Alread Existed";
                req.setAttribute("error6",error6);
                req.setAttribute("dto",signUpDTO);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("signUp.jsp");
                requestDispatcher.forward(req,resp);

            } else{
                System.out.println("Submit Sucessfully");
                String correct = "Sucessfully Submitted";
                req.setAttribute("correct",correct);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("signIn.jsp");
                requestDispatcher.forward(req,resp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}