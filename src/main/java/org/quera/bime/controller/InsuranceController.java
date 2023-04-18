package org.quera.bime.controller;


import org.quera.bime.dto.InsuranceRequest;
import org.quera.bime.model.InsuranceEntity;
import org.quera.bime.service.impl.InsuranceServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/insurances")
public class InsuranceController {

    private final InsuranceServiceImpl insuranceService;

    public InsuranceController(InsuranceServiceImpl insuranceService){
        this.insuranceService = insuranceService;
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<InsuranceEntity> getInsurance(@PathVariable Long id){
        InsuranceEntity insuranceEntity = new InsuranceEntity();
        insuranceEntity = insuranceService.findOne(id);
        return ResponseEntity.ok(insuranceEntity);
    }


    @PostMapping(value = "/save")
    public ResponseEntity<String> addInsurance(@RequestBody InsuranceRequest insuranceRequest){
        try {
            InsuranceEntity insuranceEntity = new InsuranceEntity();

            return ResponseEntity.status(HttpStatus.OK).body("Insurance saved.");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Insurance saving problem!");
        }
    }
}
