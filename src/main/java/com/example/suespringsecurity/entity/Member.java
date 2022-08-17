package com.example.suespringsecurity.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter @Setter
@ToString
@Entity
@NoArgsConstructor
public class Member {
    @Id
    // SQL 에서 자동생성되도록 돕는 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String memberName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    private String age;

    @Column(nullable = false)
    private String role;
}
