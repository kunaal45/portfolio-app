package com.kunaal.portfolio.config;

import com.kunaal.portfolio.model.Achievement;
import com.kunaal.portfolio.model.Certificate;
import com.kunaal.portfolio.model.Project;
import com.kunaal.portfolio.model.Skill;
import com.kunaal.portfolio.repository.AchievementRepository;
import com.kunaal.portfolio.repository.CertificateRepository;
import com.kunaal.portfolio.repository.ProjectRepository;
import com.kunaal.portfolio.repository.SkillRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final SkillRepository skillRepository;
    private final ProjectRepository projectRepository;
    private final CertificateRepository certificateRepository;
    private final AchievementRepository achievementRepository;

    public DataLoader(SkillRepository skillRepository,
                      ProjectRepository projectRepository,
                      CertificateRepository certificateRepository,
                      AchievementRepository achievementRepository) {
        this.skillRepository = skillRepository;
        this.projectRepository = projectRepository;
        this.certificateRepository = certificateRepository;
        this.achievementRepository = achievementRepository;
    }

    @Override
    public void run(String... args) {
        if (skillRepository.count() == 0) {
            skillRepository.save(new Skill(null, "Java", "Languages", 95));
            skillRepository.save(new Skill(null, "C", "Languages", 70));
            skillRepository.save(new Skill(null, "Python", "Languages", 75));
            skillRepository.save(new Skill(null, "SQL", "Languages", 85));

            skillRepository.save(new Skill(null, "Data Structures & Algorithms", "Core", 88));
            skillRepository.save(new Skill(null, "OOPS", "Core", 88));
            skillRepository.save(new Skill(null, "DBMS", "Core", 85));

            skillRepository.save(new Skill(null, "Spring Boot", "Backend", 90));
            skillRepository.save(new Skill(null, "Spring MVC", "Backend", 88));
            skillRepository.save(new Skill(null, "Hibernate / JPA", "Backend", 85));
            skillRepository.save(new Skill(null, "REST APIs", "Backend", 88));
            skillRepository.save(new Skill(null, "Microservices", "Backend", 75));

            skillRepository.save(new Skill(null, "NLP", "ML", 65));
            skillRepository.save(new Skill(null, "Text Classification", "ML", 60));

            skillRepository.save(new Skill(null, "MySQL", "Database", 88));
            skillRepository.save(new Skill(null, "SQL Queries", "Database", 85));
            skillRepository.save(new Skill(null, "Normalization", "Database", 80));
            skillRepository.save(new Skill(null, "CRUD Operations", "Database", 90));

            skillRepository.save(new Skill(null, "Manual Testing", "Testing", 78));
            skillRepository.save(new Skill(null, "API Testing (Postman)", "Testing", 82));
            skillRepository.save(new Skill(null, "JUnit", "Testing", 70));
            skillRepository.save(new Skill(null, "Selenium (Basics)", "Testing", 60));

            skillRepository.save(new Skill(null, "Git / GitHub", "Tools", 85));
            skillRepository.save(new Skill(null, "IntelliJ / VS Code", "Tools", 88));
            skillRepository.save(new Skill(null, "Postman", "Tools", 82));
            skillRepository.save(new Skill(null, "Spring Security / JWT", "Tools", 80));
        }

        if (projectRepository.count() == 0) {
            projectRepository.save(new Project(
                    null,
                    "IT Service Management System (ITSM)",
                    "Web-based ITSM platform built with Java, Spring Boot, Spring MVC, and MySQL to manage IT incidents and service requests, with full ticket-lifecycle REST APIs and JWT-secured role-based access.",
                    "LIVE",
                    "Spring Boot, Spring MVC, MySQL, JWT, Spring Security, Postman",
                    "https://github.com/kunaal45",
                    "https://it-service-management-system.vercel.app/"
            ));

            projectRepository.save(new Project(
                    null,
                    "AI-Powered Job Role Predictor & Resume Matcher",
                    "Full-stack recruitment support app built with Java and Spring Boot to automate resume screening and job-role matching using NLP, backed by MySQL.",
                    "IN_PROGRESS",
                    "Spring Boot, NLP, MySQL, REST API, Dashboard",
                    "https://github.com/kunaal45",
                    "#"
            ));
        }

        if (certificateRepository.count() == 0) {
            certificateRepository.save(new Certificate(
                    null,
                    "Programming in Java",
                    "NPTEL (IIT Kharagpur)",
                    "2024",
                    "#",
                    "VERIFIED"
            ));
            certificateRepository.save(new Certificate(
                    null,
                    "Database Management Systems",
                    "NPTEL (IIT Kharagpur)",
                    "2024",
                    "#",
                    "VERIFIED"
            ));
            certificateRepository.save(new Certificate(
                    null,
                    "Programming in Python",
                    "NPTEL",
                    "2023",
                    "#",
                    "VERIFIED"
            ));
            certificateRepository.save(new Certificate(
                    null,
                    "Spring Certified Professional - coming soon",
                    "VMware / Spring",
                    "Upcoming",
                    "#",
                    "COMING_SOON"
            ));
            certificateRepository.save(new Certificate(
                    null,
                    "AWS Certified Developer Associate - coming soon",
                    "Amazon Web Services",
                    "Upcoming",
                    "#",
                    "COMING_SOON"
            ));
        }

        if (achievementRepository.count() == 0) {
            achievementRepository.save(new Achievement(
                    null,
                    "Cricket Zonal Tournament - 3rd Place",
                    "Wicketkeeper-Batter representing team at Zonal Cricket Championship.",
                    "trophy",
                    "VERIFIED"
            ));
            achievementRepository.save(new Achievement(
                    null,
                    "Academic Excellence (CGPA 7.88)",
                    "Consistent academic performance in B.Tech Information Technology.",
                    "chart",
                    "VERIFIED"
            ));
            achievementRepository.save(new Achievement(
                    null,
                    "End-to-End Enterprise Systems",
                    "Architected and deployed full-stack ITSM system with REST APIs & JWT authentication.",
                    "code",
                    "VERIFIED"
            ));
            achievementRepository.save(new Achievement(
                    null,
                    "Open Source & Hackathon Achievement - coming soon",
                    "Structured placeholder for upcoming open-source contributions and hackathon rankings.",
                    "check",
                    "COMING_SOON"
            ));
        }
    }
}
