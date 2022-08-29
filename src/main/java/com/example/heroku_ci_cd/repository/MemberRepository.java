package com.example.heroku_ci_cd.repository;


import com.example.heroku_ci_cd.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
