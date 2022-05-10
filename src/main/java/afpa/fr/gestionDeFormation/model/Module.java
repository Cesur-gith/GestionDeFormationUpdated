package afpa.fr.gestionDeFormation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "module_seq")
    @SequenceGenerator(name = "module_seq", allocationSize = 1, initialValue = 1000)
    private Long id;
    private String matiere;
    private String dateDuCours;
    private String debut;
    private String fin;

    @ManyToOne
    @JsonIgnoreProperties("listModule")
    private Session session;

    @ManyToOne
    @JsonIgnoreProperties("listModule")
    private Formateur formateur;
}
