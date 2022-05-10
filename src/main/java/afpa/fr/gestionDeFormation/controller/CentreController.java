package afpa.fr.gestionDeFormation.controller;

import afpa.fr.gestionDeFormation.model.Centre;
import afpa.fr.gestionDeFormation.service.CentreService;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping ("/centre")
public class CentreController {

    private final CentreService centreService;

    // It works
    @GetMapping ("/listCentre")
    public List <Centre> getAll () {
        return centreService.getAll();
    }

    // It works
    @GetMapping("/detailsCentre/{id}")
    public Centre findById( @PathVariable Long id){
        return centreService.findById(id);
    }

    // It works
    @PostMapping("/add")
    public Centre addCentre( @RequestBody Centre centre){
        return centreService.addCentre(centre);
    }

    @GetMapping ("/formCentre")
    public String formCentre (@NotNull Model model  ) {
        Centre centre = new Centre();
        model.addAttribute("centre", centre);
        return "formCentre";
    }

/*
    @PostMapping("/add-centre")
    public String addCentre(@ModelAttribute Centre centre) {
        System.out.println("POST:" + centre);
        centreService.save(centre);
        return "redirect:/";
    }
*/

    @GetMapping ("/editCentre/{id}")
    public String update (Model model, @RequestParam Long id) {
        Centre centre = centreService.findById(id);
        model.addAttribute( "centre",  centre);
        return "editCentre";
    }

    // It works
    @DeleteMapping("/delete/{id}")
    public void deleteCentre(@PathVariable Long id) {
    centreService.deleteCenter(id);
    }

    // It works
    @PutMapping(path="/update/{id}")
    public Centre updateCentreById(@PathVariable Long id, @RequestBody Centre centre) {
        return centreService.updateCentreById(centre);
    }



}
