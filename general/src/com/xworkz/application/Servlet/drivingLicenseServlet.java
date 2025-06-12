package com.xworkz.application.Servlet;

import com.xworkz.application.DTO.drivingLicenseDTO;
import com.xworkz.application.Repositry.DrivingLicenseRepositry;
import com.xworkz.application.Repositry.DrivingLicienceRepositryImp;
import com.xworkz.application.service.DrivingLicenseImp;
import com.xworkz.application.service.DrivingLicenseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/drivingLicenseApplication", loadOnStartup = 1)
public class drivingLicenseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String adress = req.getParameter("adress");
        String date = req.getParameter("date");
        String mobile = req.getParameter("mobile");
        String type = req.getParameter("type");

        drivingLicenseDTO drivingLicenseDTO = new drivingLicenseDTO();
        drivingLicenseDTO.setName(name);
        drivingLicenseDTO.setAddress(adress);
        drivingLicenseDTO.setDate(LocalDateTime.parse(date));
        drivingLicenseDTO.setMobile(Long.parseLong(mobile));
        drivingLicenseDTO.setType(type);

        System.out.println(drivingLicenseDTO);

        req.setAttribute("drivingLicenseDTO",drivingLicenseDTO);

        DrivingLicenseService drivingLicenseService = new DrivingLicenseImp();
        drivingLicenseService.DrivingLicenseVilidiate(drivingLicenseDTO);

        DrivingLicenseRepositry drivingLicenseRepositry = new DrivingLicienceRepositryImp();
        drivingLicenseRepositry.save(drivingLicenseDTO);

    }
}
