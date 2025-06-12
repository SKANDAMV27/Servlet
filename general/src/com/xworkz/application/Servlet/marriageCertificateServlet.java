package com.xworkz.application.Servlet;

import com.xworkz.application.DTO.marriageApplicationDTO;
import com.xworkz.application.Repositry.MarriageApplicationRepositry;
import com.xworkz.application.Repositry.MarrigeApplicationRepositryImp;
import com.xworkz.application.service.MarriageApplicationService;
import com.xworkz.application.service.MarriageApplivationImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/marrageCertificateApplication",loadOnStartup = 1)
public class marriageCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = req.getParameter("name");
       String bride = req.getParameter("bride");
       String location = req.getParameter("location");
       String address = req.getParameter("address");
       String religion = req.getParameter("religion");
       String date = req.getParameter("date");
       String witness = req.getParameter("witness");
       String witness2 = req.getParameter("witness2");
       String officer = req.getParameter("officer");

        marriageApplicationDTO marriageApplicationDTO = new marriageApplicationDTO();
        marriageApplicationDTO.setGrowName(name);
        marriageApplicationDTO.setBrideName(bride);
        marriageApplicationDTO.setLocation(location);
        marriageApplicationDTO.setAddress(address);
        marriageApplicationDTO.setRelesion(religion);
        marriageApplicationDTO.setDate(LocalDate.parse(date));
        marriageApplicationDTO.setWitness(witness);
        marriageApplicationDTO.setWitness1(witness2);
        marriageApplicationDTO.setOfficer(officer);

        System.out.println(marriageApplicationDTO);

        req.setAttribute("marriageApplicationDTO",marriageApplicationDTO);

        MarriageApplicationService marriageApplicationService = new MarriageApplivationImp();
        marriageApplicationService.MarriageApplicationValidation(marriageApplicationDTO);

        MarriageApplicationRepositry marriageApplicationRepositry = new MarrigeApplicationRepositryImp();
        marriageApplicationRepositry.save(marriageApplicationDTO);



    }
}
