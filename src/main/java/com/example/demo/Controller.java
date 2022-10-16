package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    RealEstateService realEstateService;

    @GetMapping("/realEstate")
    public ResponseEntity getVerify() {
        try {
            return new ResponseEntity(
                    realEstateService.getAllRealEstate(),
                    HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }
    }
}
