package afpa.fr.gestionDeFormation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "formateur_seq")
    @SequenceGenerator(name = "formateur_seq", allocationSize = 1, initialValue = 1000)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String phone;
    private String debut;
    private String fin;

    @OneToMany (mappedBy = "formateur")
    @JsonIgnoreProperties("formateur")
    private List<Module> listModule;









}
