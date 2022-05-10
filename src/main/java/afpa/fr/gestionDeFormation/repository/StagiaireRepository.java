package afpa.fr.gestionDeFormation.repository;

import afpa.fr.gestionDeFormation.model.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StagiaireRepository extends JpaRepository<Stagiaire, Long> {


}
