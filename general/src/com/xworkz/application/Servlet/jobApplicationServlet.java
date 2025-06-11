package com.xworkz.application.Servlet;

import com.xworkz.application.DTO.jobApplicationDTO;
import com.xworkz.application.service.JobApplicationImp;
import com.xworkz.application.service.JobApplicationService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/jobApplication")
public class jobApplicationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = req.getParameter("name");
       String email= req.getParameter("email");
       String education =req.getParameter("education");
       String skills =req.getParameter("skills");
       String salary =req.getParameter("salary");
       String experence = req.getParameter("experence");

        jobApplicationDTO jobDTO = new jobApplicationDTO();
        jobDTO.setName(name);
        jobDTO.setEmail(email);
        jobDTO.setEducation(education);
        jobDTO.setSkills(skills);
        jobDTO.setSalary(Integer.parseInt(salary));
        jobDTO.setExperence(experence);

        System.out.println(jobDTO);

        req.setAttribute("jobDTO",jobDTO);

        JobApplicationService jobApplicationService = new JobApplicationImp();
        jobApplicationService.JobApplicationValidiation( jobDTO);



    }
    }

