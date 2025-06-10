package com.xworkx.weather.servlets;

import com.xworkx.weather.dto.WeatherDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/weatherServlet")
public class weatherServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String location =servletRequest.getParameter("location");
        String capuratured=servletRequest.getParameter("capturedBy");
        System.out.println(capuratured);
        String temp=servletRequest.getParameter("temperature");
        System.out.println(temp);
        String date=servletRequest.getParameter("reportDate");
        System.out.println(date);


        WeatherDTO dto=new WeatherDTO();
        dto.setDate(LocalDate.parse(date));
        dto.setLocation(location);
        dto.setRecordedBy(capuratured);
        dto.setTemperature(Integer.parseInt(temp));

        servletRequest.setAttribute("dto",dto);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("WeatherResult.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
