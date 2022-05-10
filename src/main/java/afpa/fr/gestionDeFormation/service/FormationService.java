package afpa.fr.gestionDeFormation.service;

import afpa.fr.gestionDeFormation.model.Formation;
import afpa.fr.gestionDeFormation.repository.FormationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class FormationService {


    private final FormationRepository formationRepository;
    public List<Formation> getAll() {
        return formationRepository.findAll();
    }

    public Formation findById(Long id){
        Optional<Formation> formation=formationRepository.findById(id);
        if(formation.isPresent());
        return formation.get();
    }

    public Formation getOneById(Long id) {
        return formationRepository.findOneById(id);
    }

    public void save(Formation formation) {
        formationRepository.save(formation);
    }

    public void delete(Long id) {
        formationRepository.deleteById(id);
    }

    public void update(Formation formation) {
        formationRepository.save(formation);
    }

    public void deleteFormation(Long id) {
        formationRepository.deleteById(id);
    }

    public Formation updateFormationById(Formation formation) {
        return formationRepository.save(formation);
    }
}
