package afpa.fr.gestionDeFormation.repository;

import afpa.fr.gestionDeFormation.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {


}
