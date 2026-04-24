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
public class ReviewResponse {

    private Long id;
    private Long courseId;
    private Integer rating;
    private Integer difficulty;
    private Integer workload;
    private String semester;
    private String comment;
    private Integer helpfulCount;
    private LocalDateTime createdAt;

    // Author info (flattened from User)
    private Long authorId;
    private String authorName;
    private String authorAvatarUrl;
}
