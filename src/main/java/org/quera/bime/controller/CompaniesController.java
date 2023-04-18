package org.quera.bime.controller;


import org.quera.bime.dto.CompanyRequest;
import org.quera.bime.model.CompanyEntity;
import org.quera.bime.service.impl.CompanyServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(value = "/companies")
public class CompaniesController {

    private final CompanyServiceImpl companyService;

    public CompaniesController(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<CompanyEntity> getCompany(@PathVariable Long id) {
        CompanyEntity companyEntity;
        companyEntity = companyService.findOne(id);
        if (Objects.nonNull(companyEntity)) {
            return ResponseEntity.ok(companyEntity);
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }


    @PostMapping(value = "/save")
    public ResponseEntity<String> addCompany(@RequestBody CompanyRequest companyRequest) throws Exception {
        try {
            CompanyEntity companyEntity = new CompanyEntity();
            companyEntity.setName(companyRequest.getName());
            companyService.save(companyEntity);
            return ResponseEntity.status(HttpStatus.OK).body("Company saved.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Company saving problem!");
        }
    }
}
