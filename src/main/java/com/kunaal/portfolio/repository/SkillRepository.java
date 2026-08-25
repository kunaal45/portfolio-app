package com.kunaal.portfolio.repository;

import com.kunaal.portfolio.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

// Extending JpaRepository<Skill, Long> gives you, for FREE, with zero SQL written:
// save(), findAll(), findById(), deleteById(), count() ... and more.
// "Long" here is the type of Skill's @Id field.
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
