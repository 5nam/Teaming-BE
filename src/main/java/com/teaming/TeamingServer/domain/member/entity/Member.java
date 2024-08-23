package com.teaming.TeamingServer.domain.member.entity;


import com.teaming.TeamingServer.domain.member.dto.request.MemberRequestDto;
import com.teaming.TeamingServer.domain.member.dto.response.MainPageResponseDto;
import com.teaming.TeamingServer.global.exception.BadRequestException;
import com.teaming.TeamingServer.domain.project.entity.File;
import com.teaming.TeamingServer.global.util.Time;
import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Member extends Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 45)
    private String memberName;

    @Column(nullable = false, length = 45)
    private String password;

    @Column(nullable = false, length = 45)
    private String email;

    @Column(nullable = false, length = 45)
    private String nickname;

    @Column(nullable = false, length = 45)
    private String snsType;

    @Column(nullable = false, length = 45)
    private String snsId;

    @Column(nullable = false, length = 45)
    private String sns_connect_date;

    @Column
    private String profile_image;

    @Column(nullable = false)
    private boolean agreement;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<MemberProject> memberProjects = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<MemberSchedule> memberSchedules = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<File> files = new ArrayList<>();


    // 여기도 스케줄 관련 추가해야줘야하나??

    @Builder
    public Member(String name, String email, String password, boolean agreement) {
        this.nickname = name;
        this.email = email;
        this.password = password;
        this.agreement = agreement;
    }

    public Member(MemberRequestDto dto) {
        this.nickname = dto.getName();
        this.email = dto.getEmail();
        this.password = dto.getPassword();
    }

    public Member updateProfileImage(String profile_image) {
        this.profile_image = profile_image;
        return this;
    }

    public Member updatePassword(String password) {
        this.password = password;
        return this;
    }

    public Member updateNickName(String nickName) {
        this.nickname = nickName;
        return this;
    }

    public Member updateMemberProject(MemberProject memberProject) {
        this.memberProjects.add(memberProject);
        return this;
    }

    public Member setRandomPassword() {
        this.password = RandomStringUtils.randomAlphanumeric(10);
        return this;
    }

    public boolean isPasswordMatched(String password) {
        return this.password.equals(password);
    }

    public UsernamePasswordAuthenticationToken getAuthenticationToken() {
        return new UsernamePasswordAuthenticationToken(email, password);
    }

    public void validatePassword(String password) {
        if(!isPasswordMatched(password)) {
            throw new BadRequestException("비밀번호가 일치하지 않습니다.");
        }
    }

    public MainPageResponseDto.InviteMember toInviteMember() {
        MainPageResponseDto.InviteMember inviteMember = new MainPageResponseDto.InviteMember(this.nickname, this.profile_image, this.email);

        return inviteMember;
    }
}