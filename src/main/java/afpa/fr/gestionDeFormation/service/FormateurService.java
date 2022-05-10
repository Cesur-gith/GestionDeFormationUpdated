package afpa.fr.gestionDeFormation.service;

import afpa.fr.gestionDeFormation.model.Formateur;
import afpa.fr.gestionDeFormation.repository.FormateurRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor

public class FormateurService {

    private final FormateurRepository formateurRepository;
    public List<Formateur> getAll() {

        return formateurRepository.findAll();
    }
}
