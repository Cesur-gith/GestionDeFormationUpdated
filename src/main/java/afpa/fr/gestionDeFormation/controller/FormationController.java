package afpa.fr.gestionDeFormation.controller;

import afpa.fr.gestionDeFormation.model.Centre;
import afpa.fr.gestionDeFormation.model.Formation;
import afpa.fr.gestionDeFormation.service.FormationService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping ("/formation")
public class FormationController {


    private final FormationService formationService;

    // Works
    @GetMapping ("/listFormation")
    public String listFormation (Model model){
        List<Formation>formation= formationService.getAll();
        model.addAttribute("formation", formation);
        return "listFormation";
    }

    @GetMapping("/detailsFormation/{id}")
    public Formation findById(@PathVariable Long id){
        return formationService.findById(id);
    }

    /*
    @GetMapping("/detailsFormation/{id}")
    public String detail (Model model, @RequestParam Long id){
        Formation formation= formationService.getOneById(id);
        model.addAttribute("formation",formation);
        return "detailsFormation";
    }

     */

    @GetMapping ("/formFormation")
    public String formFormation (@NotNull Model model  ) {
        Formation formation = new Formation();
        model.addAttribute("formation", formation);
        return "formFormation";
    }

    @PostMapping("add-formation")
    public String addFormation(@ModelAttribute Formation formation) {
        System.out.println("POST:" + formation);
        formationService.save(formation);
        return "redirect:/";
    }

    @GetMapping ("/editFormation")
    public String editCentre (Model model, @RequestParam Long id) {
        Formation  formation = formationService.getOneById(id);
        model.addAttribute( "formation",  formation);
        return "editFormation";
    }

    @PostMapping ("/envFormation")
    public String envFormation (@ModelAttribute Formation formation ) {
    formationService.update(formation);
    return "redirect:/listFormation";

    }

    @PostMapping("/deleteFormation/{id}")

    public String deleteFormation (@RequestParam Long id){
        formationService.delete(id);
        return "redirect:/";
    }

    // It works
    @DeleteMapping("/delete/{id}")
    public void deleteFormationn(@PathVariable Long id) {
        formationService.deleteFormation(id);
    }


    // It works
    @PutMapping(path="/update/{id}")
    public Formation updateFormationeById(@PathVariable Long id, @RequestBody Formation formation) {
        return formationService.updateFormationById(formation);
    }
}