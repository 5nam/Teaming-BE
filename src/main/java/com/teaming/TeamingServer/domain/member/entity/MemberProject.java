package com.teaming.TeamingServer.domain.member.entity;

import com.teaming.TeamingServer.domain.project.entity.Project;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class MemberProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_project_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    public void setMember(Member member) {
        this.member = member;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}