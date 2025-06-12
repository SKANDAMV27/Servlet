package com.xworkz.application.Servlet;

import com.xworkz.application.DTO.passportDTO;
import com.xworkz.application.Repositry.PassportRepositry;
import com.xworkz.application.Repositry.PassportRepositryImp;
import com.xworkz.application.service.PassportImp;
import com.xworkz.application.service.PassportService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/passport",loadOnStartup = 1)
public class passportServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String aadarno = req.getParameter("number");;
        String address = req.getParameter("address");
        String panNo = req.getParameter("PanNo");
        String country = req.getParameter("Country");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String pinCode = req.getParameter("pinCode");
        String passportType = req.getParameter("passportType");
        String refernce = req.getParameter("refernce");

        passportDTO passportDTO = new passportDTO();
        passportDTO.setName(name);
        passportDTO.setAadhar(Integer.parseInt(aadarno));
        passportDTO.setAddress(address);
        passportDTO.setPanNo(panNo);
        passportDTO.setCountry(country);
        passportDTO.setState(state);
        passportDTO.setCity(city);
        passportDTO.setPincode(Integer.parseInt(pinCode));
        passportDTO.setPassportType(passportType);
        passportDTO.setReferance(Integer.parseInt(refernce));

        System.out.println(passportDTO);

        req.setAttribute("passportDTO", passportDTO);

        PassportService passportService = new PassportImp();
        passportService.PassportValidiation(passportDTO);

        PassportRepositry passportRepositry = new PassportRepositryImp();
        passportRepositry.save(passportDTO);

    }
}
