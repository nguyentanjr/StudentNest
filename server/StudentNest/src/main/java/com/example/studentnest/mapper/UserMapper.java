package com.example.studentnest.mapper;

import com.example.studentnest.dto.response.UserResponse;
import com.example.studentnest.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse toResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .major(user.getMajor())
                .year(user.getYear())
                .avatarUrl(user.getAvatarUrl())
                .emailVerified(user.getEmailVerified())
                .createdAt(user.getCreatedAt())
                .build();
    }
}
