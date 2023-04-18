package org.quera.bime.controller;


import org.quera.bime.dto.InsuranceRequest;
import org.quera.bime.model.CompanyEntity;
import org.quera.bime.model.InsuranceEntity;
import org.quera.bime.service.impl.CompanyServiceImpl;
import org.quera.bime.service.impl.InsuranceServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/insurances")
public class InsuranceController {

    private final InsuranceServiceImpl insuranceService;
    private final CompanyServiceImpl companyService;

    public InsuranceController(InsuranceServiceImpl insuranceService,CompanyServiceImpl companyService) {
        this.insuranceService = insuranceService;
        this.companyService = companyService;
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<InsuranceEntity> getInsurance(@PathVariable Long id) {
        InsuranceEntity insuranceEntity;
        insuranceEntity = insuranceService.findOne(id);
        return ResponseEntity.ok(insuranceEntity);
    }


    @PostMapping(value = "/save")
    public ResponseEntity<String> addInsurance(@RequestBody InsuranceRequest insuranceRequest) {
        try {
            InsuranceEntity insuranceEntity = new InsuranceEntity();
            Long companyId = insuranceRequest.getCompany_id();
            CompanyEntity companyEntity = companyService.findOne(companyId);
            insuranceEntity.setCompany(companyEntity);
            return ResponseEntity.status(HttpStatus.OK).body("Insurance saved.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Insurance saving problem!");
        }
    }
}
