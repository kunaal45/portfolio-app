package com.kunaal.portfolio.repository;

import com.kunaal.portfolio.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
