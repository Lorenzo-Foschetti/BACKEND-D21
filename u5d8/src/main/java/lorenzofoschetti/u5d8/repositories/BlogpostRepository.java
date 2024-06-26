package lorenzofoschetti.u5d8.repositories;

import lorenzofoschetti.u5d8.entities.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BlogpostRepository extends JpaRepository<Blogpost, UUID> {


}
