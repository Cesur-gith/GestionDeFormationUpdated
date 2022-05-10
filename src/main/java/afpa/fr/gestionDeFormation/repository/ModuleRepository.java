package afpa.fr.gestionDeFormation.repository;

import afpa.fr.gestionDeFormation.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {


}
