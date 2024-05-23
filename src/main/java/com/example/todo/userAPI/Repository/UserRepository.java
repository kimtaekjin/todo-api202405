package com.example.todo.userAPI.Repository;

import com.example.todo.userAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    // 이메일 중복 체크
//    @Query("SELECT COUNT(*) FROM User u WHERE u.email =: email") -> JPQL
    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

}