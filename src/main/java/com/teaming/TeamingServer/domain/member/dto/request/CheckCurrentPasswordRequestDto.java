package com.teaming.TeamingServer.domain.member.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CheckCurrentPasswordRequestDto {
    private String currentPassword;
}
