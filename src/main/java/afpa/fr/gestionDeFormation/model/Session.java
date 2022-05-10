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
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "session_seq")
    @SequenceGenerator(name = "session_seq", allocationSize = 1, initialValue = 1000)
    private Long id;
    private String listeDeModule;
    private String listeDeStagiaire;
    private String adresse;
    private String debut;
    private String fin;

    @ManyToOne
    @JsonIgnoreProperties("listSession")
    private Formation formation;

    @OneToMany (mappedBy = "session")
    @JsonIgnoreProperties("session")
    private List<Module> listModule;

    @OneToMany (mappedBy = "session")
    @JsonIgnoreProperties("session")
    private List<Stagiaire> listStagiaire;
}
