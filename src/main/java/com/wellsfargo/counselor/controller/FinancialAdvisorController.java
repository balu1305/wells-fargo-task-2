package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.FinancialAdvisor;
import com.wellsfargo.counselor.service.FinancialAdvisorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/financial-advisors")
public class FinancialAdvisorController {
    private final FinancialAdvisorService financialAdvisorService;

    public FinancialAdvisorController(FinancialAdvisorService financialAdvisorService) {
        this.financialAdvisorService = financialAdvisorService;
    }

    @GetMapping
    public List<FinancialAdvisor> getAllFinancialAdvisors() {
        return financialAdvisorService.getAllFinancialAdvisors();
    }

    @PostMapping
    public void addFinancialAdvisor(@RequestBody FinancialAdvisor financialAdvisor) {
        financialAdvisorService.saveFinancialAdvisor(financialAdvisor);
    }
}
