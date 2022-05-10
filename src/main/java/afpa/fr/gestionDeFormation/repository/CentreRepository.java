package afpa.fr.gestionDeFormation.repository;

import afpa.fr.gestionDeFormation.model.Centre;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.jni.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CentreRepository extends JpaRepository<Centre, Long> {

    @Query(value = "select * from center where id = ?1", nativeQuery = true)
    public Centre findOneById(Long id);

    @Query(value = "select * from center where id = ?1", nativeQuery = true)
    public Centre updateCenterById(Long id);




}
