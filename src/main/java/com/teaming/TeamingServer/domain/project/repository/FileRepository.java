package com.teaming.TeamingServer.domain.project.repository;

import com.teaming.TeamingServer.domain.project.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FileRepository extends JpaRepository<File,Long> {

    Optional<File> findById(Long fileId);
}
