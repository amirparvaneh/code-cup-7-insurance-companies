package org.quera.bime.service.impl;

import org.quera.bime.model.CompanyEntity;
import org.quera.bime.repository.CompanyRepository;
import org.quera.bime.service.CompanyService;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void save(CompanyEntity companyEntity) {
        companyRepository.save(companyEntity);
    }

    @Override
    public CompanyEntity findOne(Long id) {
        Optional<CompanyEntity> companyEntity;
        companyEntity = companyRepository.findById(id);
        return companyEntity.orElse(null);
    }
}
