package com.xworkz.policeStation.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/missing")
public class MissingPersonServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String missingPersonName = request.getParameter("missingPersonName");
        String mobile = request.getParameter("mobile");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String location = request.getParameter("location");
        String marks = request.getParameter("marks");
        String langKnown = request.getParameter("langKnown");

        request.setAttribute("missingPersonName", missingPersonName);
        request.setAttribute("mobile", mobile);
        request.setAttribute("age", age);
        request.setAttribute("gender", gender);
        request.setAttribute("address", address);
        request.setAttribute("location", location);
        request.setAttribute("marks", marks);
        request.setAttribute("langKnown", langKnown);

        RequestDispatcher dispatcher = request.getRequestDispatcher("MissingPersonResult.jsp");
        dispatcher.forward(request, response);
    }
}
