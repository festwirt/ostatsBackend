package backend.ostats.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Forschung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int energieTec;
    private int laserTec;
    private int ionenTec;
    private int hyperraumTec;
    private int plasmaTec;
    private int verbrennungstriebwerk;
    private int impulstriebwerk;
    private int hyperraumantrieb;
    private int spioTec;
    private int computerTec;
    private int astrophysik;
    private int forschungsnetzwerk;
    private int gravitonforschung;
    private int waffenTec;
    private int schildTec;
    private int raumschiffpanzerung;
}
