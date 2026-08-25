package com.kunaal.portfolio.repository;

import com.kunaal.portfolio.model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}
