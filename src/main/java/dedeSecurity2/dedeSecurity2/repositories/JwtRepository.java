package dedeSecurity2.dedeSecurity2.repositories;

import dedeSecurity2.dedeSecurity2.entities.Jwt;
import org.springframework.data.repository.CrudRepository;

public interface JwtRepository extends CrudRepository<Jwt, Integer> {

}
