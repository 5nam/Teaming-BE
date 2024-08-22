package com.teaming.TeamingServer.domain.schedule.dto.request;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Data
public class MonthlyRequestDto {

    private LocalDate date_request;
}
