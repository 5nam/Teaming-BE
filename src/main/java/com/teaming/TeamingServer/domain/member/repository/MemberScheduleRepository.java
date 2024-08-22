package com.teaming.TeamingServer.domain.member.repository;

import com.teaming.TeamingServer.domain.member.entity.Member;
import com.teaming.TeamingServer.domain.member.entity.MemberSchedule;
import com.teaming.TeamingServer.domain.schedule.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberScheduleRepository extends JpaRepository<MemberSchedule, Long> {

//    List<MemberSchedule> memberSchedules = memberScheduleRepository.findById(memberId).stream().toList();

    List<MemberSchedule> findByMember(Member member);

    Optional<MemberSchedule> findBySchedule(Schedule schedule);

//    Optional<MemberSchedule> haveSchedules = memberScheduleRepository.findBySchedule(schedule);

}
