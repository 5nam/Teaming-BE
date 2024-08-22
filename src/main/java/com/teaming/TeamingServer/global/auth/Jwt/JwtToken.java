package com.teaming.TeamingServer.global.auth.Jwt;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class JwtToken {
    private String grantType;
    private Long memberId;
    private String accessToken;
//    private String refreshToken;
}