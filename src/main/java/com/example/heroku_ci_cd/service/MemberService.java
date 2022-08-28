package com.example.heroku_ci_cd.service;

import com.example.heroku_ci_cd.dto.MemberDto;
import com.example.heroku_ci_cd.entity.MemberCloudwi;
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
        MemberCloudwi member = new MemberCloudwi(memberDto);
        memberRepository.save(member);

        return member.getId();
    }

    public List<MemberCloudwi> getMembers() {
        return memberRepository.findAll();
    }

}
