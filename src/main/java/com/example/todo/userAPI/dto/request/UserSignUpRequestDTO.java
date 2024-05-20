package com.example.todo.userAPI.dto.request;

import com.example.todo.userAPI.entity.User;
import com.sun.tools.javac.Main;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter @Getter @ToString
@EqualsAndHashCode(of = "email")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSignUpRequestDTO {

    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(min = 8,max = 20)
    private String password;
    @NotBlank
    @Size(min = 2,max = 5)
    private String userName;

    public User toEntity(){
        return User.builder()
                .email(email)
                .password(password)
                .userName(userName)
                .build();
    }




}
