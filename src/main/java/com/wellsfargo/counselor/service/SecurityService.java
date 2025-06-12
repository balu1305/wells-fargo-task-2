package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.Security;
import com.wellsfargo.counselor.repository.SecurityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService {
    private final SecurityRepository securityRepository;

    public SecurityService(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    public void saveSecurity(Security security) {
        securityRepository.save(security);
    }
}
