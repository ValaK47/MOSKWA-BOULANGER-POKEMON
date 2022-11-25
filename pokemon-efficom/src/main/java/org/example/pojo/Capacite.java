package org.example.pojo;

import org.example.enumGlobal.Type;

public class Capacite {

    //Attribut
    private String name;

    private Integer precision;

    private Integer puissance;

    private Type type;

    //Constructor
    public Capacite(){
        name="";
        precision = 0;
        puissance = 0;
        type = Type.NORMAL;
    }

    public Capacite(String nom, Integer precision, Integer puissance, Type type) {
        this.name = nom;
        this.precision = precision;
        this.puissance = puissance;
        this.type = type;
    }

    //Getter Setter

    public String getNom() {
        return name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Integer getPuissance() {
        return puissance;
    }

    public void setPuissance(Integer puissance) {
        this.puissance = puissance;
    }

    public Integer getType() {
        return puissance;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "\n" + this.name.toUpperCase() + "\nPuissance : " + this.puissance + "\nPrecision : " + this.precision + "\nType : " + this.type;
    }
}
