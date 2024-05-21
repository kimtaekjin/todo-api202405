package com.example.todo.userAPI.dto;

import com.example.todo.userAPI.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

//호그인 성공 후 클라이언트에게 전송할 데이터 객체
@Getter @Setter @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
public class LoginReponseDTO {
    
    private String email;
    private String userName;
    
    @JsonFormat(pattern = "yyyy년 MM월 dd일")
    private LocalDateTime joinDate;

    private  String token; //인증 토큰

    public LoginReponseDTO(User user, String token) {

        this.email=user.getEmail();
        this.userName=user.getUserName();
        this.joinDate= LocalDateTime.from(LocalDate.from(user.getJoinDate()));
        this.token=token;

    }
}
