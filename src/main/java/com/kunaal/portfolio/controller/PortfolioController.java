package com.kunaal.portfolio.controller;

import com.kunaal.portfolio.model.ContactMessage;
import com.kunaal.portfolio.repository.AchievementRepository;
import com.kunaal.portfolio.repository.CertificateRepository;
import com.kunaal.portfolio.repository.ContactMessageRepository;
import com.kunaal.portfolio.repository.ProjectRepository;
import com.kunaal.portfolio.repository.SkillRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class PortfolioController {

    private final SkillRepository skillRepository;
    private final ProjectRepository projectRepository;
    private final CertificateRepository certificateRepository;
    private final AchievementRepository achievementRepository;
    private final ContactMessageRepository contactMessageRepository;

    public PortfolioController(SkillRepository skillRepository,
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

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("skills", skillRepository.findAll());
        model.addAttribute("projects", projectRepository.findAll());
        model.addAttribute("certificates", certificateRepository.findAll());
        model.addAttribute("achievements", achievementRepository.findAll());
        return "portfolio";
    }

    @PostMapping("/contact")
    @ResponseBody
    public ResponseEntity<Map<String, String>> handleContact(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "subject", required = false) String subject,
            @RequestParam(value = "message", required = false) String message) {

        // Persist contact message into H2 Database
        ContactMessage contactMessage = new ContactMessage(
                null,
                name != null ? name : "Anonymous",
                email != null ? email : "no-email",
                subject != null ? subject : "General Inquiry",
                message != null ? message : "",
                LocalDateTime.now()
        );
        ContactMessage saved = contactMessageRepository.save(contactMessage);

        return ResponseEntity.ok(Map.of(
                "status", "SUCCESS",
                "message", "HTTP 200 OK — Thank you " + saved.getName() + "! Your message (ID #" + saved.getId() + ") has been saved to the database.",
                "messageId", String.valueOf(saved.getId())
        ));
    }
}
