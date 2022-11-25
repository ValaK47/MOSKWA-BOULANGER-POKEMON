package org.example.pojo;

import org.example.enumGlobal.Type;

import java.util.List;

public class Kaimorse extends Pokemon {

    private String modeEvolution;

    public Kaimorse() {
        super();
        this.modeEvolution = "";
    }

    public Kaimorse(String modeEvolution) {
        this.modeEvolution = modeEvolution;
    }

    public Kaimorse(String name, int pv, int attaque, int defense, int speed, List<Capacite> capacites, Type type, String modeEvolution) {
        super(name, pv, attaque, defense, speed, capacites, type);
        this.modeEvolution = modeEvolution;
    }

    public String toString() {
        return super.toString() + ", mon mode d'évolution est " + this.modeEvolution;
    }
}