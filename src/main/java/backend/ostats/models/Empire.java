package backend.ostats.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Empire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    private Account account;

    @NotNull
    @Size(min = 3)
    private String name;

    private LocalDate startDatum;

    @OneToMany(mappedBy = "empire")
    private List<Kolonie> kolonies;

    private String uniName;
    private int uniEcoSpeed;
    private int uniFleetSpeed;
    private int uniResearchSpeed;
    private String klasse;
    private boolean commander;
    private boolean admiral;
    private boolean ingeneur;
    private boolean geologe;
    private boolean technokrat;

    private Forschung forschung;

    private EmpireSettings settings;

    private int anzahlGalaxien;

}
