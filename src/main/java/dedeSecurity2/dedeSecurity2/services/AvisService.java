package dedeSecurity2.dedeSecurity2.services;

import dedeSecurity2.dedeSecurity2.entities.Avis;
import dedeSecurity2.dedeSecurity2.entities.Utilisateur;
import dedeSecurity2.dedeSecurity2.repositories.AvisRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AvisService {

    private final AvisRepository avisRepository;

    public void creer(Avis avis){
        Utilisateur utilisateur = (Utilisateur) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        avis.setUtilisateur(utilisateur);
        this.avisRepository.save(avis);
    }
}