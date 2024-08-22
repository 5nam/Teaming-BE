package com.teaming.TeamingServer.domain.member.repository;

import com.teaming.TeamingServer.domain.member.entity.Member;
import com.teaming.TeamingServer.domain.member.entity.MemberProject;
import com.teaming.TeamingServer.domain.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberProjectRepository extends JpaRepository<MemberProject, Long> {

    List<MemberProject> findByMember(Member member); // member 로 MemberProject 를 찾는 것

    List<MemberProject> findByProject(Project project); // project 로 참여 멤버들 조회

}
