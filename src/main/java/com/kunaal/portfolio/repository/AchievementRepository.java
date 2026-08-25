package com.kunaal.portfolio.repository;

import com.kunaal.portfolio.model.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchievementRepository extends JpaRepository<Achievement, Long> {
}
