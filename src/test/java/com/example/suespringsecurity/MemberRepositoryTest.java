package com.example.suespringsecurity;

import com.example.suespringsecurity.entity.Member;
import com.example.suespringsecurity.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Optional;

@SpringBootTest
@Slf4j
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void insertTest() {
        for(int i=0; i<10; i++) {
            Member member = new Member();
            member.setId(i);
            member.setMemberName("Name" + i);
            member.setPassword("pw" + i);
            member.setEmail("hihi@" + i);
            member.setRole("admin" + i);
            memberRepository.save(member);
        }
    }

    @Test
    public void testMember() {
        Optional<Member> result = Optional.ofNullable(memberRepository.findAllById(2));
        result.ifPresent(member -> log.info("member " + member));
    }
}
