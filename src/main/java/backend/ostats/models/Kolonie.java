package backend.ostats.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Kolonie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @Min(0)
    private int felderBasic;

    @NotNull
    private int maxTemp;
    // Versorgung
    private int metMine;
    private int krisMine;
    private int deutMine;
    private int solarkraftwerk;
    private int fusionskraftwerk;
    private int metSpeicher;
    private int krisSpeicher;
    private int deutSpeicher;
    // Anlagen
    private int roboterfabrik;
    private int raumschiffwerft;
    private int forschungslabor;
    private int allianzdepot;
    private int raketensilo;
    private int nanitenfabrik;
    private int terrarformer;
    private int raumdock;
    // Deff
    private int raketenwerfer;
    private int leichteLaser;
    private int schwereLaser;
    private int gausskanonen;
    private int ionengeschuetz;
    private int plasmawerfer;
    private int kleineSchildkuppel;
    private int grosseSchildkuppel;
    private int abafangraketen;
    private int interplanetarraketen;
    // Stationierte Flotte
    private int leichteJaeger;
    private int schwereJaeger;
    private int kreuzer;
    private int schlachtschiffe;
    private int schlachtkreuzer;
    private int bomber;
    private int zerstoerer;
    private int todessterne;
    private int reaper;
    private int pathfinder;
    private int kt;
    private int gt;
    private int kolonieschiffe;
    private int recycler;
    private int spios;
    private int solarSats;
    private int crawler;
    // Mond
    private Mond mond;
    private BoostItem boostMet;
    private BoostItem boostKris;
    private BoostItem boostDeut;
    // Sonstiges
    private String kolonieImg;
    private String kolonieDetailsImg;
    // Produktion in Prozent
    private int metAuslastung;
    private int krisAuslastung;
    private int deutAuslastung;
    private int crawlerAuslastung;
    private int solarkraftwerkAuslastung;
    private int fusionskraftwerkAuslastung;
    private int solarsatsAuslastung;
}
