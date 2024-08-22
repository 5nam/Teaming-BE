package com.teaming.TeamingServer.domain.project.dto.request;

import com.teaming.TeamingServer.domain.project.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectStatusRequestDto {
    private Status project_status;
}
