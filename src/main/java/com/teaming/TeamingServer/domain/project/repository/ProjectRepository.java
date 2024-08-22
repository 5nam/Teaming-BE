package com.teaming.TeamingServer.domain.project.repository;

import com.teaming.TeamingServer.domain.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
