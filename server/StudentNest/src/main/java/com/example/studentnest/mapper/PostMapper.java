package com.example.studentnest.mapper;

import com.example.studentnest.dto.response.PostResponse;
import com.example.studentnest.entity.Post;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    public PostResponse toResponse(Post post, Long commentCount) {
        return PostResponse.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .category(post.getCategory())
                .pinned(post.getPinned())
                .likeCount(post.getLikeCount())
                .commentCount(commentCount)
                .status(post.getStatus() != null ? post.getStatus().name() : null)
                .createdAt(post.getCreatedAt())
                .authorId(post.getUser().getId())
                .authorName(post.getUser().getName())
                .authorAvatarUrl(post.getUser().getAvatarUrl())
                .build();
    }
}
