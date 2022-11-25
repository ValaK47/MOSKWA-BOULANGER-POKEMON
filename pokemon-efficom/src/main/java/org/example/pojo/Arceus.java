package org.example.pojo;

import org.example.enumGlobal.Type;

import java.util.List;

public class Arceus extends Pokemon {

    private String modeEvolution;

    public Arceus() {
        super();
        this.modeEvolution = "";
    }

    public Arceus(String modeEvolution) {
        this.modeEvolution = modeEvolution;
    }

    public Arceus(String name, int pv, int attaque, int defense, int speed, List<Capacite> capacites, Type type, String modeEvolution) {
        super(name, pv, attaque, defense, speed, capacites, type);
        this.modeEvolution = modeEvolution;
    }

    public String toString() {
        return super.toString() + ", mon mode d'évolution est " + this.modeEvolution;
    }
}