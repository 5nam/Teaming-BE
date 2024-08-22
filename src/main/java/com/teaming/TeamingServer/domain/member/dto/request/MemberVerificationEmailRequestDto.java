package com.teaming.TeamingServer.domain.member.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVerificationEmailRequestDto {
    private String authentication;
}
