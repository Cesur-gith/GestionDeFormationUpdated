package afpa.fr.gestionDeFormation.service;

import afpa.fr.gestionDeFormation.model.Session;
import afpa.fr.gestionDeFormation.repository.SessionRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SessionService {

    private final SessionRepository sessionRepository;
}
