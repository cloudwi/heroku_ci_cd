package com.example.heroku_ci_cd.entity;

import com.example.demo.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public Member(MemberDto memberDto) {
        this.name = memberDto.getName();
    }

    public Long getId() {
        return this.id;
    }
}
