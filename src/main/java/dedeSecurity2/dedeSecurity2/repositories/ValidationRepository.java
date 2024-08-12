package dedeSecurity2.dedeSecurity2.repositories;


import dedeSecurity2.dedeSecurity2.entities.Validation;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ValidationRepository extends CrudRepository<Validation, Integer> {

    Optional<Validation> findByCode(String code);
}