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
public class PostResponse {

    private Long id;
    private String title;
    private String content;
    private String category;
    private Boolean pinned;
    private Integer likeCount;
    private Long commentCount;
    private String status;
    private LocalDateTime createdAt;

    // Author info
    private Long authorId;
    private String authorName;
    private String authorAvatarUrl;
}
