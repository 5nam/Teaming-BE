package com.teaming.TeamingServer.domain.member.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ProgressProjectsPageResponseDto {
    private Long member_id;
    private String member_name;
    private List<MainPageResponseDto.ProgressProject> progressProjects;
}
