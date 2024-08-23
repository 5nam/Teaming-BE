package com.teaming.TeamingServer.domain.member.entity;

import jakarta.persistence.*;
import org.joda.time.DateTime;

@Entity
public class MemberLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private DateTime login_date;

    @Column(length = 45)
    private String login_status;

    @Column(length = 45)
    private String login_type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

}
