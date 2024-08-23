package com.teaming.TeamingServer.domain.member.application;

import com.teaming.TeamingServer.domain.member.dto.request.MemberRequestDto;
import com.teaming.TeamingServer.domain.member.dto.request.MemberResetPasswordRequestDto;
import com.teaming.TeamingServer.domain.member.dto.response.MemberLoginResponse;

public class AuthSocialServiceImpl implements AuthService {
    @Override
    public void join(MemberRequestDto memberRequestDto) {

    }

    @Override
    public void validateEmailRequest(String email) throws Exception {

    }

    @Override
    public void verifyEmailCode(String inputCode) {

    }

    @Override
    public MemberLoginResponse login(String email, String password) {
        return null;
    }

    @Override
    public void resetPassword(MemberResetPasswordRequestDto memberResetPasswordRequestDto) {

    }
}
