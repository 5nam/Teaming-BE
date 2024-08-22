package com.teaming.TeamingServer.domain.project.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectCreateRequestDto {

    private String project_name;
    private MultipartFile project_image;
    private LocalDate start_date;
    private LocalDate end_date;
    private String project_color;

}

