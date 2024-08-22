package com.teaming.TeamingServer.domain.member.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberNicknameChangeRequestDto {
    private String change_nickname;
}
