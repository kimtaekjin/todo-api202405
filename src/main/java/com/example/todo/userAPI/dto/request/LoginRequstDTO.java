package com.example.todo.userAPI.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter @Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequstDTO {


    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
}
