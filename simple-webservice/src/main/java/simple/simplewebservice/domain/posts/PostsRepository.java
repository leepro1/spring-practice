package simple.simplewebservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Entity Repository -
 * Entity와 함께 위치
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
