package com.teaming.TeamingServer.domain.member.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PortfolioPageResponseDto {
    private Long member_id;
    private String member_name;
    private List<MainPageResponseDto.Portfolio> portfolio;
}
