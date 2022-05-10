package afpa.fr.gestionDeFormation.repository;

import afpa.fr.gestionDeFormation.model.Centre;
import afpa.fr.gestionDeFormation.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {

    @Query(value = "select * from formation where id=?1",nativeQuery = true)
    Formation findOneById(Long id);

    @Query(value = "select * from formation where id=?1",nativeQuery = true)
    Formation deleteOneById(Long id);

    @Query(value = "select * from formation where id = ?1", nativeQuery = true)
    public Formation updateFormationById(Long id);


}
