package com.example.Blogpost.api.controller;

import com.example.Blogpost.api.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // No code needed — JpaRepository provides all CRUD methods
}
