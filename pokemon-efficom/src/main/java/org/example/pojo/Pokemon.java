package org.example.pojo;

import org.example.enumGlobal.Type;

import java.util.List;
import java.util.ArrayList;

public class Pokemon {

    //Attribut
    private String name;

    private int pv;

    private int attack;

    private int defense;

    private int speed;

    private List<Capacite> capacites;


    private Type type;


    //Constructeur
    public Pokemon(){
        name ="";
        pv =0;
        capacites =new ArrayList<Capacite>();
        type = Type.NORMAL;
        attack =0;
        defense =0;
        speed =0;
    }


    public Pokemon(String name, int pv, int attack, int defense, int speed, List<Capacite> capacites, Type type) {
        this.name = name;
        this.pv = pv;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.capacites = capacites;
        this.type = type;
    }

    //Accesseur et mutateur
    public String getName() {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public List<Capacite> getCapacites() {
        return capacites;
    }

    public void setCapacites(List<Capacite> capacites) {
        this.capacites = capacites;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString()
    {
        return "\n" + this.name.toUpperCase() + " PV : " + this.pv + " Type : " + this.type + " Attaque : " + this.attack + " Defense : " + this.defense + " Vitesse : " + this.speed + "\nCes attaques sont :\n" + this.capacites + "\n";
    }
}
