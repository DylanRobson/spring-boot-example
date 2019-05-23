package app.controller;

import app.model.User;
import app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /* List */

    @GetMapping("/users")
    private List<User> listUsers() {
        return this.userRepository.findAll();
    }

    /* Get */

    @GetMapping("/users/{id}")
    private User getUser(@PathVariable Long id) {
        return this.userRepository.findById(id).orElse(null);
    }

    /* Create */

    @PostMapping("/users")
    private User createUser(@RequestParam String username, @RequestParam String password) {
        // Insecure! For demonstration only.
        // TODO: Password shouldn't be plaintext and auth credentials shouldn't be passed by URL query params.
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return this.userRepository.save(user);
    }

}
