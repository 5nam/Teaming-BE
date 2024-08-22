package com.teaming.TeamingServer.domain.project.repository;

import com.teaming.TeamingServer.domain.project.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}