package com.teaming.TeamingServer.domain.schedule.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilteringScheduleRequestDto {

    private LocalDate schedule_start;
}
