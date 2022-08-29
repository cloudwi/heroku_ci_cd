package com.example.heroku_ci_cd.entity;

import com.example.heroku_ci_cd.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "member_name")
    private String name;

    public Member(MemberDto memberDto) {
        this.name = memberDto.getName();
    }

    public Long getId() {
        return this.id;
    }
}
