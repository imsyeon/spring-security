package com.example.suespringsecurity.repository;

import com.example.suespringsecurity.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Integer> {
    Member findAllById(int id);
}
