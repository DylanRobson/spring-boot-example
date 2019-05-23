package app.repository;

import app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA uses JPA to store data in a relational database.
 * It creates {@link org.springframework.data.repository.Repository} implementations automatically at runtime from this interface.
 * @see <a href="https://docs.spring.io/spring-data/jpa/docs/2.1.8.RELEASE/reference/html/#jpa.query-methods.query-creation"/>.
 *
 * In a typical Java application you'd expect to write UserRepositoryImpl yourself in order to support more complex queries.
 */
public interface UserRepository extends JpaRepository<User, Long> {

// TODO: for auth provider
// User findByUsername(String username);

}