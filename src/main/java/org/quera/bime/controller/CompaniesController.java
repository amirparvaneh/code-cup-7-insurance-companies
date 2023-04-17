package org.quera.bime.controller;


import org.quera.bime.model.CompanyEntity;
import org.quera.bime.service.impl.CompanyServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/companies")
public class CompaniesController {

    private final CompanyServiceImpl companyService;

    public CompaniesController(CompanyServiceImpl companyService){
        this.companyService = companyService;
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<CompanyEntity> getCompany(@PathVariable Long id){

    }


    @PostMapping(value = "/save")
    public ResponseEntity<String> addCompany(@RequestBody CompanyEntity companyEntity){

    }
}
