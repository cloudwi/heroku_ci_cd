package com.example.heroku_ci_cd.repository;


import com.example.heroku_ci_cd.entity.MemberCloudwi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberCloudwi,Long> {
}
