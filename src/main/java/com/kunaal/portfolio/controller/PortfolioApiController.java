package com.kunaal.portfolio.controller;

import com.kunaal.portfolio.model.Achievement;
import com.kunaal.portfolio.model.Certificate;
import com.kunaal.portfolio.model.ContactMessage;
import com.kunaal.portfolio.model.Project;
import com.kunaal.portfolio.model.Skill;
import com.kunaal.portfolio.repository.AchievementRepository;
import com.kunaal.portfolio.repository.CertificateRepository;
import com.kunaal.portfolio.repository.ContactMessageRepository;
import com.kunaal.portfolio.repository.ProjectRepository;
import com.kunaal.portfolio.repository.SkillRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PortfolioApiController {

    private final SkillRepository skillRepository;
    private final ProjectRepository projectRepository;
    private final CertificateRepository certificateRepository;
    private final AchievementRepository achievementRepository;
    private final ContactMessageRepository contactMessageRepository;

    public PortfolioApiController(SkillRepository skillRepository,
                                  ProjectRepository projectRepository,
                                  CertificateRepository certificateRepository,
                                  AchievementRepository achievementRepository,
                                  ContactMessageRepository contactMessageRepository) {
        this.skillRepository = skillRepository;
        this.projectRepository = projectRepository;
        this.certificateRepository = certificateRepository;
        this.achievementRepository = achievementRepository;
        this.contactMessageRepository = contactMessageRepository;
    }

    // GET http://localhost:8081/api/skills -> JSON array of every skill
    @GetMapping("/skills")
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    // GET http://localhost:8081/api/projects -> JSON array of every project
    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // GET http://localhost:8081/api/certificates -> JSON array of certificates
    @GetMapping("/certificates")
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    // GET http://localhost:8081/api/achievements -> JSON array of achievements
    @GetMapping("/achievements")
    public List<Achievement> getAllAchievements() {
        return achievementRepository.findAll();
    }

    // GET http://localhost:8081/api/contact-messages -> JSON array of contact messages submitted by users
    @GetMapping("/contact-messages")
    public List<ContactMessage> getAllContactMessages() {
        return contactMessageRepository.findAll();
    }
}
