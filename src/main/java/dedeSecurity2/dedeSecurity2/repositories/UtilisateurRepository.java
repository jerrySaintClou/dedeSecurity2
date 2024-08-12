package dedeSecurity2.dedeSecurity2.repositories;

import dedeSecurity2.dedeSecurity2.entities.Utilisateur;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {
    Optional<Utilisateur> findByEmail(String email);
}
