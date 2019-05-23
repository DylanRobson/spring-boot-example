package app.controller;

import app.model.Post;
import app.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    /* List */

    @GetMapping("/posts")
    private List<Post> listPosts() {
        return this.postService.listPosts();
    }

    @GetMapping("/users/{authorId}/posts")
    private List<Post> listPostsByUserId(@PathVariable Long authorId) {
        return this.postService.listPostsByUserId(authorId);
    }

    /* Get */

    @GetMapping("/posts/{id}")
    private Post getPost(@PathVariable Long id) {
        return this.postService.getPost(id);
    }

    /* Create */

    @PostMapping("/posts")
    private Post createPost(@RequestParam String title, @RequestParam String content) {
        Post post = new Post();

        // FIXME: session user id
//        User author = this.getUser(1L);
//        post.setAuthor(author);

        post.setTitle(title);
        post.setContent(content);
        return this.postService.addPost(post);
    }

}
