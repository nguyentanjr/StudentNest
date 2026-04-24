package com.example.studentnest.repository;

import com.example.studentnest.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    Page<Comment> findByPostIdAndParentIsNullAndStatusNot(
            Long postId, Comment.Status status, Pageable pageable);

    List<Comment> findByParentIdAndStatusNot(Long parentId, Comment.Status status);

    long countByPostIdAndStatusNot(Long postId, Comment.Status status);
}
