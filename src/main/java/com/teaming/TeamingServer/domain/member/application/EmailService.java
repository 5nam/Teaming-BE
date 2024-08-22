package com.teaming.TeamingServer.domain.member.application;

public interface EmailService {
    void sendValidateEmailRequestMessage(String to, String verificationCode);
    void sendResetPasswordMessage(String email, String newPassword) throws Exception;
}
