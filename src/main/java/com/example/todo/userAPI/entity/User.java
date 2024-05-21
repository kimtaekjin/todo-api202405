package com.example.todo.userAPI.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id; //식별 코드
    @Column(nullable = false,unique = true)
    private  String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String userName;
    @CreationTimestamp
    private LocalDateTime joinDate;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Role role = Role.COMMON; //유저 권한



}
