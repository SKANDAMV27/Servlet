package com.xworkz.application.service;

import com.xworkz.application.DTO.passportDTO;

public class PassportImp implements PassportService{
    @Override
    public String PassportValidiation(passportDTO passportDTO) {
        return "failure";
    }
}
