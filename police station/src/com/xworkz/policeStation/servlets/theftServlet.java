package com.xworkz.policeStation.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/theft")
public class theftServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name = servletRequest.getParameter("name");
        String mobile = servletRequest.getParameter("mobile");
        String age = servletRequest.getParameter("age");
        String address = servletRequest.getParameter("address");
        String location = servletRequest.getParameter("location");
        String item = servletRequest.getParameter("item");
        String lostOn = servletRequest.getParameter("lostOn");

        servletRequest.setAttribute("name", name);
        servletRequest.setAttribute("mobile", mobile);
        servletRequest.setAttribute("age", age);
        servletRequest.setAttribute("address", address);
        servletRequest.setAttribute("location", location);
        servletRequest.setAttribute("item", item);
        servletRequest.setAttribute("lostOn", lostOn);

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("theftResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }
}
