package app.repository;

import app.model.Post;
import app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Spring Data JPA uses JPA to store data in a relational database.
 * It creates {@link org.springframework.data.repository.Repository} implementations automatically at runtime from this interface.
 * @see <a href="https://docs.spring.io/spring-data/jpa/docs/2.1.8.RELEASE/reference/html/#jpa.query-methods.query-creation"/>.
 *
 * In a typical Java application you'd expect to write PostRepositoryImpl yourself in order to support more complex queries.
 */
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByAuthor(User author);

}
