package com.example.studentnest.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CommentRequest {

    @NotBlank(message = "Content is required")
    private String content;

    // null = top-level comment, non-null = reply to a comment
    private Long parentId;
}
