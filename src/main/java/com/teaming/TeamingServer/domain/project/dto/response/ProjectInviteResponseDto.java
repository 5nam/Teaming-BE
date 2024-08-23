package com.teaming.TeamingServer.domain.project.dto.response;

import com.teaming.TeamingServer.domain.member.dto.response.MainPageResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectInviteResponseDto {
    private List<MainPageResponseDto.InviteMember> members;
}
