package com.example.studentnest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private String major;
    private Integer year;
    private String avatarUrl;
    private Boolean emailVerified;
    private LocalDateTime createdAt;
}
