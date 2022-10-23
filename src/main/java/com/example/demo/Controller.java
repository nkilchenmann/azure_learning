package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    RealEstateService realEstateService;

    @GetMapping("/realEstate")
    public ResponseEntity getVerify() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setAccessControlAllowOrigin("*");

            return new ResponseEntity(
                    realEstateService.getAllRealEstate(),
                    httpHeaders,
                    HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }
    }
}
