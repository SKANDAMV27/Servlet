package com.xworkz.application.service;

import com.xworkz.application.DTO.jobApplicationDTO;

public class JobApplicationImp implements JobApplicationService{
    @Override
    public String JobApplicationValidiation( jobApplicationDTO jobDTO) {
        return "failure";
    }
}
