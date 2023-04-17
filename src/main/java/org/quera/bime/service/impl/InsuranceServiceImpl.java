package org.quera.bime.service.impl;

import org.quera.bime.model.InsuranceEntity;
import org.quera.bime.repository.InsuranceRepository;
import org.quera.bime.service.InsuranceService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    private final InsuranceRepository insuranceRepository;

    public InsuranceServiceImpl(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    @Override
    public void save(InsuranceEntity insuranceEntity) {
        insuranceRepository.save(insuranceEntity);
    }

    @Override
    public InsuranceEntity findOne(Long id) {
        Optional<InsuranceEntity> result;
        result = insuranceRepository.findById(id);
        return result.get();
    }
}
