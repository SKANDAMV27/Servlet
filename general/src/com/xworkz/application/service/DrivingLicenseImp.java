package com.xworkz.application.service;

import com.xworkz.application.DTO.drivingLicenseDTO;

public class DrivingLicenseImp implements DrivingLicenseService{


    @Override
    public String DrivingLicenseVilidiate(drivingLicenseDTO drivingLicenseDTO) {
        return "false";
    }
}
