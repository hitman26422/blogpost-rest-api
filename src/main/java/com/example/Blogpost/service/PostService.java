package com.example.Blogpost.service;

import com.example.Blogpost.api.model.Post;
import com.example.Blogpost.api.controller.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    // Create new blog post
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    // Get all blog posts
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // Get a single post by ID
    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    // Update post
    public Optional<Post> updatePost(Long id, Post updatedPost) {
        return postRepository.findById(id).map(post -> {
            post.setTitle(updatedPost.getTitle());
            post.setContent(updatedPost.getContent());
            post.setCategory(updatedPost.getCategory());
            post.setTags(updatedPost.getTags());
            return postRepository.save(post);
        });
    }

    // Delete post
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
