package com.teaming.TeamingServer.domain.project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SingleFileResponseDto {

    private String project_name;
    private String file_type;
    private String file_name;
    private String uploader;
    private LocalDate upload_date;
}
