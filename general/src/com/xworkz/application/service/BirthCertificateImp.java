package com.xworkz.application.service;

import com.xworkz.application.DTO.birthCertificateDTO;
import com.xworkz.application.Repositry.BirthCertificateRepositry;
import com.xworkz.application.Repositry.BirthCertificateRepositryImp;

public class BirthCertificateImp implements BirthCertificateService {
    @Override
    public String BirthCertificateValidiate(birthCertificateDTO dto) {

        BirthCertificateRepositry repo = new BirthCertificateRepositryImp();

        if (dto.getName() == null || dto.getName().equalsIgnoreCase("Select")) {
            return "Please select a valid hospital name.";
        }

        String father = dto.getFather();
        if (father == null || father.length() < 4 || father.length() > 30) {
            return "Father's name should be between 4 and 30 characters.";
        }

        String mother = dto.getMother();
        if (mother == null || mother.length() < 4 || mother.length() > 30) {
            return "Mother's name should be between 4 and 30 characters.";
        }

        if (dto.getDate() == null) {
            return "Date and time of birth must be provided.";
        }

        String doctor = dto.getDoctor();
        if (doctor == null || doctor.length() < 3 || doctor.length() > 30) {
            return "Doctor's name must be between 3 and 30 characters.";
        }

        String nurse = dto.getNurse();
        if (nurse == null || nurse.length() < 3 || nurse.length() > 30) {
            return "Nurse's name must be between 3 and 30 characters.";
        }

        String hospitalType = dto.getHospital();
        if (hospitalType == null || hospitalType.equalsIgnoreCase("Select")) {
            return "Please select a valid hospital type.";
        }

        repo.save(dto);
        return "saved";

    }
    public birthCertificateDTO  findById(int Id){
        System.out.println("Find the Id............");
        if(Id<=0){
            System.out.println("Id is not avaliable");
            return null;
        }
        System.out.println("Fount Id Finding The ID to Repo");


        return null;

    }

}









