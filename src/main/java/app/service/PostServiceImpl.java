package app.service;

import app.model.Post;
import app.model.User;
import app.repository.PostRepository;
import app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "postService")
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    /* List */

    @Override
    public List<Post> listPosts() {
        return this.postRepository.findAll();
    }

    @Override
    public List<Post> listPostsByUserId(Long authorId) {
        User author = this.userRepository.findById(authorId).orElse(null);
        return this.postRepository.findByAuthor(author);
    }

    /* Get */

    @Override
    public Post getPost(Long id) {
        return this.postRepository.findById(id).orElse(null);
    }

    /* Create */

    @Override
    public Post addPost(Post post) {
        // TODO: replace (hardcoded authorId) --> session user id
        User author = this.userRepository.findById(1L).orElse(null);
        post.setAuthor(author);
        return this.postRepository.save(post);
    }

}
