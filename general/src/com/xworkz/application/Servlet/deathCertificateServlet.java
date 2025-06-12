package com.xworkz.application.Servlet;

import com.xworkz.application.DTO.deathCertificateDTO;
import com.xworkz.application.Repositry.DeathCertificateRepositry;
import com.xworkz.application.Repositry.DeathCertificateRepositryImp;
import com.xworkz.application.service.DeathCertificateImp;
import com.xworkz.application.service.DeathCertificateService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/deathApplication" , loadOnStartup = 1)
public class deathCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String cause=req.getParameter("cause");
        String date=req.getParameter("date");
        String age = req.getParameter("age");
        String certified = req.getParameter("certified");
        String hospital = req.getParameter("hospital");
        String death = req.getParameter("death");
        String gender = req.getParameter("gender");
        String marks = req.getParameter("marks");

        deathCertificateDTO deathCertificateDTO = new deathCertificateDTO();
        deathCertificateDTO.setName(name);
        deathCertificateDTO.setCause(cause);
        deathCertificateDTO.setDate(LocalDateTime.parse(date));
        deathCertificateDTO.setAge(Integer.parseInt(age));
        deathCertificateDTO.setCertified(certified);
        deathCertificateDTO.setHospital(hospital);
        deathCertificateDTO.setDeath(death);
        deathCertificateDTO.setGender(gender);
        deathCertificateDTO.setMarks(marks);

        System.out.println(deathCertificateDTO);

        req.setAttribute("deathCertificateDTO",deathCertificateDTO);

        DeathCertificateService deathCertificateService = new DeathCertificateImp();
        deathCertificateService.DeathCertificateValidiate(deathCertificateDTO);

        DeathCertificateRepositry deathCertificateRepositry = new DeathCertificateRepositryImp();
        deathCertificateRepositry.save(deathCertificateDTO);
    }
}
