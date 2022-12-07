package com.example.yeppi.entity;

import com.example.yeppi.dto.SignupForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Getter
public class User {
    // 대표값
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userId;

    @Column
    private String password;


    @Column
    private String email;

    public static User create(SignupForm dto) {
        return new User(dto.getId(),
                dto.getUserId(),
                dto.getPassword(),
                dto.getEmail());
    }
}