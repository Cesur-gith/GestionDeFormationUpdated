package afpa.fr.gestionDeFormation.repository;

import afpa.fr.gestionDeFormation.model.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Long> {


}
