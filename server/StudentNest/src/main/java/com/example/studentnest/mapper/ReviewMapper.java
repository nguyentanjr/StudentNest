package com.example.studentnest.mapper;

import com.example.studentnest.dto.response.ReviewResponse;
import com.example.studentnest.entity.Review;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {

    public ReviewResponse toResponse(Review review) {
        return ReviewResponse.builder()
                .id(review.getId())
                .courseId(review.getCourse().getId())
                .rating(review.getRating())
                .difficulty(review.getDifficulty())
                .workload(review.getWorkload())
                .semester(review.getSemester())
                .comment(review.getComment())
                .helpfulCount(review.getHelpfulCount())
                .createdAt(review.getCreatedAt())
                .authorId(review.getUser().getId())
                .authorName(review.getUser().getName())
                .authorAvatarUrl(review.getUser().getAvatarUrl())
                .build();
    }
}
