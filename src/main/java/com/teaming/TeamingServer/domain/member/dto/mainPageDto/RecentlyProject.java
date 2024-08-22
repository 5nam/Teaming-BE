package com.teaming.TeamingServer.domain.member.dto.mainPageDto;

import com.teaming.TeamingServer.domain.project.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecentlyProject {
    private Long projectId;
    private String projectName;
    private LocalDate projectCreatedDate;
    private Status projectStatus;
    private String projectImage;
}