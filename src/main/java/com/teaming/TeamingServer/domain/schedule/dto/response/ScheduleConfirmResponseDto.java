package com.teaming.TeamingServer.domain.schedule.dto.response;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScheduleConfirmResponseDto {
    private String schedule_name;
    private LocalDate schedule_start;
    private LocalTime schedule_start_time;
    private LocalDate schedule_end;
    private LocalTime schedule_end_time;
}
