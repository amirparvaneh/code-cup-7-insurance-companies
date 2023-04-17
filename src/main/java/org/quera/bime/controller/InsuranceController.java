package org.quera.bime.controller;


import org.quera.bime.model.InsuranceEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/insurances")
public class InsuranceController {

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<InsuranceEntity> getInsurance(@PathVariable Long id){

    }


    @PostMapping(value = "/save")
    public ResponseEntity<String> addInsurance(@RequestBody InsuranceEntity insuranceEntity){

    }
}
