package afpa.fr.gestionDeFormation.controller;

import afpa.fr.gestionDeFormation.model.Formateur;
import afpa.fr.gestionDeFormation.service.FormateurService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/formateur")
public class FormateurController {

    private final FormateurService formateurService;

    @GetMapping("/listFormateur")
    public List <Formateur> getAll(){
        return formateurService.getAll();
    }
}
