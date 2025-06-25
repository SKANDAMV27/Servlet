package com.xworkz.login.servlet;

import com.xworkz.login.dto.SignInDTO;
import com.xworkz.login.service.SignInService;
import com.xworkz.login.service.SignInServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/signIn")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId =req.getParameter("idID");
        String passWord=req.getParameter("passWord");

        SignInDTO signInDTO = new SignInDTO();
        signInDTO.setUserId(Integer.parseInt(userId));
        signInDTO.setPassWord(passWord);

        SignInService signInService = new SignInServiceImp();
        boolean result=signInService.validiation(Integer.parseInt(userId),passWord);

        if(result){
            HttpSession httpSession = req.getSession();
            httpSession.getAttribute("userId");

        }



    }
}
