package com.teaming.TeamingServer.global.auth.Jwt;

import com.teaming.TeamingServer.domain.member.entity.Member;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;

public interface JwtTokenProvider {
    JwtToken generateToken(Member member);
    Authentication getAuthentication(String accessToken);
    boolean validateToken(String token);
    void checkMemberId(Authentication authentication, HttpServletRequest request);
    void logoutToken(String accessToken);
    String resolveToken(HttpServletRequest request);
}
