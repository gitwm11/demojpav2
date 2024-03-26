package ma.waddad.demojpav2.dao.repositories;

import ma.waddad.demojpav2.dao.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
