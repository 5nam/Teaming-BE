package com.teaming.TeamingServer.domain.member.dto.response;

import com.teaming.TeamingServer.global.auth.Jwt.JwtToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberLoginResponse {
    private String name;
    private JwtToken jwtToken;
}
