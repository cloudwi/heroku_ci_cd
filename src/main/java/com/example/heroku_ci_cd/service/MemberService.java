package com.example.heroku_ci_cd.service;

import com.example.heroku_ci_cd.dto.MemberDto;
import com.example.heroku_ci_cd.entity.Member;
import com.example.heroku_ci_cd.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long saveMember(MemberDto memberDto) {
        Member member = new Member(memberDto);
        memberRepository.save(member);

        return member.getId();
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

}
