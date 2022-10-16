package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

@Service
public class RealEstateService {
    @Autowired
    RealEstateRepository realEstateRepository;

    public List<RealEstate> getAllRealEstate() {
        return (List<RealEstate>) realEstateRepository.findAll();
    }
}
