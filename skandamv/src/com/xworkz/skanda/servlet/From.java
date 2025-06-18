package com.xworkz.skanda.servlet;

import com.xworkz.skanda.dto.FormDTO;
import com.xworkz.skanda.repositry.FormRepositry;
import com.xworkz.skanda.repositry.FormRepositryImpo;
import com.xworkz.skanda.service.FormService;
import com.xworkz.skanda.service.FormServiceImpo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/Form")
public class From extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
               String name = req.getParameter("name");
               String age =req.getParameter("age");
               String father = req.getParameter("father");
               String mother = req.getParameter("mother");
               String adress=req.getParameter("adress");

        FormDTO formDTO = new FormDTO();
        formDTO.setName(name);
        formDTO.setAge(Integer.parseInt(age));
        formDTO.setFather(father);
        formDTO.setMother(mother);
        formDTO.setAdress(adress);

        System.out.println(formDTO);

        FormService formService = new FormServiceImpo();
        formService.FormServiceValidiation(formDTO);

        FormRepositry formRepositry = new FormRepositryImpo();
        formRepositry.save(formDTO);
    }
}
