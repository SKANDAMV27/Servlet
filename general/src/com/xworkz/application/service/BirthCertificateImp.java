package com.xworkz.application.service;

import com.xworkz.application.DTO.birthCertificateDTO;
import com.xworkz.application.Repositry.BirthCertificateRepositry;
import com.xworkz.application.Repositry.BirthCertificateRepositryImp;

public class BirthCertificateImp implements BirthCertificateService{
    @Override
    public String BirthCertificateValidiate( birthCertificateDTO birthCertificateDTO) {

        BirthCertificateRepositry birthCertificateRepositry = new BirthCertificateRepositryImp();
        String father = birthCertificateDTO.getFather();
        String mother = birthCertificateDTO.getMother();

        if(father==null || father.length()<4 || father.length()>30)
        {
            return "Enter The Full Name";
        }
        else if (mother==null || mother.length()<4 || mother.length()>30 )
        {
            return "Name Should be more than 4 and less then 30 ";
        }
        birthCertificateRepositry.save(birthCertificateDTO);

        return "saved";

    }

}
