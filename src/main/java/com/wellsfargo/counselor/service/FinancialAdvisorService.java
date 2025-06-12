package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.FinancialAdvisor;
import com.wellsfargo.counselor.repository.FinancialAdvisorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialAdvisorService {
    private final FinancialAdvisorRepository financialAdvisorRepository;

    public FinancialAdvisorService(FinancialAdvisorRepository financialAdvisorRepository) {
        this.financialAdvisorRepository = financialAdvisorRepository;
    }

    public List<FinancialAdvisor> getAllFinancialAdvisors() {
        return financialAdvisorRepository.findAll();
    }

    public void saveFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        financialAdvisorRepository.save(financialAdvisor);
    }
}
