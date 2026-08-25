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
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;     // "LIVE" or "IN_PROGRESS" — used to style a badge
    private String techStack;  // stored simply as "Spring Boot, MySQL, JWT" for now
    private String codeUrl;
    private String liveUrl;
}
