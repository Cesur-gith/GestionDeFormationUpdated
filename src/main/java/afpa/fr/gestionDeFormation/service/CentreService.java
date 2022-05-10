package afpa.fr.gestionDeFormation.service;

import afpa.fr.gestionDeFormation.model.Centre;
import afpa.fr.gestionDeFormation.repository.CentreRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class CentreService {


    private final CentreRepository centreRepository;

    public List<Centre> getAll() {
        return centreRepository.findAll();
    }

    public Centre findById(Long id){
        Optional<Centre> centre=centreRepository.findById(id);
        if(centre.isPresent());
        return centre.get();
    }


    public void save(Centre centre) {
        centreRepository.save(centre);
    }

    public void update(Centre centre) {
        centreRepository.save(centre);
    }

    public Centre addCentre(Centre centre) {
        return centreRepository.save(centre);
    }

    public void deleteCenter(Long id) {
        centreRepository.deleteById(id);
    }

    public Centre updateCentreById(Centre centre) {
        return centreRepository.save(centre);
    }
}
