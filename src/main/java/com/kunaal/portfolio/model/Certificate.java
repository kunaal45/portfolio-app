package com.kunaal.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;          // e.g. "Java Programming"
    private String issuer;         // e.g. "NPTEL / IIT Kharagpur"
    private String issueDate;      // e.g. "2024"
    private String credentialUrl;  // Link to certificate or "#"
    private String status;         // "VERIFIED" or "COMING_SOON"
}
