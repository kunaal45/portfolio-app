package com.kunaal.portfolio.repository;

import com.kunaal.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
