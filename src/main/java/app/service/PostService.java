package app.service;

import app.model.Post;

import java.util.List;

public interface PostService {

    List<Post> listPosts();
    List<Post> listPostsByUserId(Long authorId);
    Post getPost(Long id);
    Post addPost(Post post);

}
