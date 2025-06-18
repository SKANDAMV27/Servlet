package com.xworkz.skanda.service;

import com.xworkz.skanda.dto.FormDTO;

public class FormServiceImpo implements FormService{
    @Override
    public String FormServiceValidiation(FormDTO formDTO) {
        return "False";
    }
}
