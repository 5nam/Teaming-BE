package com.teaming.TeamingServer.domain.member.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberMyPageResponseDto {
    private Long memberId;
    private String name;
    private String email;
    private String profileImage;
}
