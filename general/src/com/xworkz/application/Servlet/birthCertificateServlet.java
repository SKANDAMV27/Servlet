package com.xworkz.application.Servlet;

import com.xworkz.application.DTO.birthCertificateDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/birthApplication",loadOnStartup = 1)
public class birthCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String Id = req.getParameter("birth");
       String name = req.getParameter("name");
       String father = req.getParameter("father");
       String mother = req.getParameter("mother");
       String date = req.getParameter("date");
       String doctor = req.getParameter("doctor");
       String nurse = req.getParameter("nurse");
       String hospital = req.getParameter("hospital");

        birthCertificateDTO birthCertificateDTO = new birthCertificateDTO();
        birthCertificateDTO.setId(Integer.parseInt(Id));
        birthCertificateDTO.setName(name);
        birthCertificateDTO.setFather(father);
        birthCertificateDTO.setMother(mother);
        birthCertificateDTO.setDate(LocalDate.from(LocalDateTime.parse(date)));
        birthCertificateDTO.setDoctor(doctor);
        birthCertificateDTO.setNurse(nurse);
        birthCertificateDTO.setHospital(hospital);

        req.setAttribute("birthCertificateDTO",birthCertificateDTO);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("birthCertificateResult.jsp");
        requestDispatcher.forward(req,resp);


    }
}
