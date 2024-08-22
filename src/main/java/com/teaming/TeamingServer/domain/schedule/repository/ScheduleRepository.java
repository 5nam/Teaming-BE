package com.teaming.TeamingServer.domain.schedule.repository;

import com.teaming.TeamingServer.domain.schedule.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
