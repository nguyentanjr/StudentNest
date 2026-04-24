package com.example.studentnest.repository;

import com.example.studentnest.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Page<Post> findByStatusNotOrderByPinnedDescCreatedAtDesc(
            Post.Status status, Pageable pageable);

    Page<Post> findByCategoryAndStatusNotOrderByPinnedDescCreatedAtDesc(
            String category, Post.Status status, Pageable pageable);

    Page<Post> findByUserIdAndStatusNot(Long userId, Post.Status status, Pageable pageable);
}
