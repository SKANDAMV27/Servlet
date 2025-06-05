package com.xworkz.school.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submitServelet")
public class SubmitServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        System.out.println(name);
        String num =servletRequest.getParameter("number");
        int number=Integer.parseInt(num);
        String city = servletRequest.getParameter("city");
        System.out.println(city);

//        servletResponse.setContentType("text/html");
//        PrintWriter writer= servletResponse.getWriter();
//        writer.println("name :"+name);
//        writer.println("number :"+number);

        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("Result.jsp");
        servletRequest.setAttribute("name",name);
        servletRequest.setAttribute("number",number);
        servletRequest.setAttribute("city",city);
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
