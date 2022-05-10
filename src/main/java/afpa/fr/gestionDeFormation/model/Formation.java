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
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "formation_seq")
    @SequenceGenerator(name = "formation_seq", allocationSize = 1, initialValue = 1000)

    private Long id;
    private String nomDeFormation;
    private String listeDeFormation;

    @ManyToMany
    @JoinTable (
            name="centres_formations",
            joinColumns = @JoinColumn (name="centre_id"),
            inverseJoinColumns = @JoinColumn (name="formation_id")
    )
    @JsonIgnoreProperties("listFormation")
    private List<Centre> listCentre;



    @OneToMany (mappedBy = "formation")
    @JsonIgnoreProperties("formation")
    private List<Session> listSession;



}
