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

public class Centre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "centre_seq")
    @SequenceGenerator(name = "centre_seq", allocationSize = 1, initialValue = 1000)
    private Long id;
    private String nom;
    private String adresse;
    private String listeDeFormation;

    @ManyToMany(mappedBy = "listCentre")
    @JsonIgnoreProperties("listCentre")
    private List<Formation> listFormation;






}
