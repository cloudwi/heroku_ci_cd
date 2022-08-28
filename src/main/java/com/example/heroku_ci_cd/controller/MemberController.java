package com.example.heroku_ci_cd.controller;

import com.example.heroku_ci_cd.dto.MemberDto;
import com.example.heroku_ci_cd.entity.MemberCloudwi;
import com.example.heroku_ci_cd.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public Long setMember(@RequestBody MemberDto memberDto) {
        return memberService.saveMember(memberDto);
    }

    @GetMapping
    public List<MemberCloudwi> getMembers() {
        return memberService.getMembers();
    }
}
