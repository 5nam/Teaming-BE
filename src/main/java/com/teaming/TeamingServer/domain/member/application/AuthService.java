package com.teaming.TeamingServer.domain.member.application;

import com.teaming.TeamingServer.domain.member.dto.request.MemberRequestDto;
import com.teaming.TeamingServer.domain.member.dto.request.MemberResetPasswordRequestDto;
import com.teaming.TeamingServer.domain.member.dto.response.MemberLoginResponse;

public interface AuthService {
    void join(MemberRequestDto memberRequestDto);

    void validateEmailRequest(String email) throws Exception;

    void verifyEmailCode(String inputCode);

    MemberLoginResponse login(String email, String password);

    void resetPassword(MemberResetPasswordRequestDto memberResetPasswordRequestDto);
}
