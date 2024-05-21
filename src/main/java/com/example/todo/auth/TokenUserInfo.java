package com.example.todo.auth;

import com.example.todo.userAPI.entity.Role;
import lombok.*;

@Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenUserInfo {

    private String userId;
    private  String email;
    private Role role;
}
