package afpa.fr.gestionDeFormation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Stagiaire {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stagiaire_seq")
    @SequenceGenerator(name = "stagiaire_seq", allocationSize = 1, initialValue = 1000)
    private Long id;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String email;
    private String phone;
    private String debut;
    private String fin;

    @ManyToOne
    @JsonIgnoreProperties("listStagiaire")
    private Session session;
}
