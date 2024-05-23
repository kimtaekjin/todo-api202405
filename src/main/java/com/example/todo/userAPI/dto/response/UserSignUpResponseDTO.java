package com.example.todo.userAPI.dto.response;

import com.example.todo.userAPI.entity.User;
import lombok.*;

@Setter @Getter @ToString
@EqualsAndHashCode(of = "email")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSignUpResponseDTO {

    private String email;

    private String userName;

    public UserSignUpResponseDTO(User saved) {
        this.email = saved.getEmail();
        this.userName = saved.getUserName();
    }

}