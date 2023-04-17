package org.quera.bime.service.impl;

import org.quera.bime.model.CompanyEntity;
import org.quera.bime.repository.CompanyRepository;
import org.quera.bime.service.CompanyService;
import org.springframework.stereotype.Service;


@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void save(CompanyEntity companyEntity) {

    }

    @Override
    public CompanyEntity findOne(Long id) {
        return null;
    }
}
