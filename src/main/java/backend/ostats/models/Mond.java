package backend.ostats.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mond {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Min(0)
    private int felder;
    @Min(0)
    private int durchmesser;
    // Anlagen
    private int roboterfabrik;
    private int raumschiffwerft;
    private int mondbasis;
    private int sensorphalanx;
    private int sprungtor;
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
    // Sonstiges
    private String bild;

}
