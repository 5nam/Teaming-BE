package com.teaming.TeamingServer.domain.member.dto.response;

import com.teaming.TeamingServer.domain.project.entity.Status;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MainPageResponseDto {
    private Long memberId;
    private String name;
    // 최근 프로젝트
    private List<RecentlyProject> recentlyProject;
    // 진행중인 프로젝트
    private List<ProgressProject> progressProject;
    // 포트폴리오
    private List<Portfolio> portfolio;

    @AllArgsConstructor
    public static class InviteMember {
        private String member_name;
        private String member_image;
        private String member_email;
    }

    @AllArgsConstructor
    public static class Portfolio {
        private Long projectId;
        private String projectName;
        private LocalDate projectStartDate;
        private LocalDate projectEndDate;
        private String projectImage;
        private Status projectStatus;
    }

    @AllArgsConstructor
    public static class RecentlyProject {
        private Long projectId;
        private String projectName;
        private LocalDate projectCreatedDate;
        private Status projectStatus;
        private String projectImage;
    }

    @AllArgsConstructor
    public static class ProgressProject {
        private Long projectId;
        private String projectName;
        private LocalDate projectStartDate;
        private LocalDate projectEndDate;
        private String projectImage;
        private Status projectStatus;
    }
}
