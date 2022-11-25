package org.example;


import org.example.enumGlobal.Type;
import org.example.pojo.*;


import java.util.*;

import static java.lang.Integer.TYPE;
import static java.lang.Integer.parseInt;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner((System.in));
        ArrayList<Capacite> capacitesAdversaire = new ArrayList<>();
        System.out.println("combien de pokemon voulez-vous dans votre equipe ?");
        int maxEquipe = sc.nextInt();
        ArrayList<Pokemon> equipe = new ArrayList<>();
        ArrayList<Pokemon> adversaire = new ArrayList<>();
        for (int i = 0; i<=maxEquipe-1;i++) {
            //Création des capacites
            List<Capacite> capacites = new ArrayList<>();
            boolean verif = false;
            String name = "";
            String typePok = "";

            System.out.println("Quel est le nom de votre pokemon ?");
            while (!verif) {
                sc.nextLine();
                try {
                    name = sc.nextLine();
                    parseInt(name);
                    System.out.println("erreur");
                    System.out.println("Quel est le nom de votre pokemon ?");
                    sc.next();
                } catch (NumberFormatException e) {
                    verif = true;
                }
            }
            verif = false;
            System.out.println("Quel est son type ?");
            while (!verif) {
                    typePok = sc.nextLine();
                    if(verifType(typePok))
                    {
                        verif = true;
                    }
                    else
                    {
                        System.out.println("erreur");
                        System.out.println("Quel est le type de votre pokemon ?");
                        sc.reset();
                    }
                }

            verif = false;
            System.out.println("Quel est son nombre de pv ?");
            int pv = 0;
            while (!verif) {
                try {
                    pv = sc.nextInt();
                    verif = true;
                } catch (InputMismatchException e) {
                    System.out.println("erreur");
                    sc.next();
                    System.out.println("Quel est son nombre de pv ?");
                }
            }
            verif = false;
            int attack = 0;
            System.out.println("Entrez son attaque ?");
            while (!verif) {
                try {
                    attack = sc.nextInt();
                    verif = true;
                } catch (InputMismatchException e) {
                    System.out.println("erreur");
                    sc.next();
                    System.out.println("Entrez son attaque ?");
                }
            }
            verif = false;
            System.out.println("Entrez sa défense ?");
            int defense = 0;
            while (!verif) {
                try {
                    defense = sc.nextInt();
                    verif = true;
                } catch (InputMismatchException e) {
                    System.out.println("erreur");
                    sc.next();
                    System.out.println("Entrez sa défense ?");
                }
            }
            verif = false;
            System.out.println("Entrez sa vitesse ?");
            int speed = 0;
            while (!verif) {
                try {
                    speed = sc.nextInt();
                    verif = true;
                } catch (InputMismatchException e) {
                    System.out.println("erreur");
                    sc.next();
                    System.out.println("Entrez sa vitesse?");
                }
            }
            Pokemon monPokemon = new Pokemon(name, pv, attack, defense, speed, capacites, Type.valueOf(typePok.toUpperCase()));
            int nbOfCapacities = 0;
            int nbOfCapacitiesOfPokemon = 0;
            verif = false;
            int precision = 0;
            int puissance = 0;
            String nomCap = "";
            String typeCap = "";
            System.out.println("Combien de capacités possède t'il ?");
            nbOfCapacitiesOfPokemon = sc.nextInt();
            while (nbOfCapacities < nbOfCapacitiesOfPokemon) {
                while (!verif) {
                    sc.nextLine();
                    try {
                        System.out.println("Nom de la capacité n°" + (nbOfCapacities + 1) + " ?");
                        nomCap = sc.nextLine();
                        parseInt(nomCap);
                        System.out.println("erreur veuillez entrer un nom valide");
                        sc.nextLine();
                    } catch (NumberFormatException e) {
                        verif = true;
                    }
                }
                verif = false;
                while (!verif) {
                    System.out.println("Type de la capacité n°" + (nbOfCapacities + 1) + " ?");
                    typeCap = sc.nextLine();
                    if(verifType(typeCap))
                    {
                        verif = true;
                    }
                    else
                    {
                        System.out.println("erreur veuillez entrer un type valide");
                        sc.reset();
                    }
                }

                verif = false;

                while (!verif) {
                    try {
                        System.out.println("Taux de precision de la capacité n°" + (nbOfCapacities + 1) + " ?");
                        precision = sc.nextInt();
                        verif = true;
                    } catch (InputMismatchException e) {
                        System.out.println("erreur veuillez entrer un numéro valide");
                        sc.next();
                    }
                }
                verif = false;
                while (!verif) {
                    try {
                        System.out.println("Puissance d'attaque de la capacité n°" + (nbOfCapacities + 1) + " ?");
                        puissance = sc.nextInt();
                        verif = true;
                    } catch (InputMismatchException e) {
                        System.out.println("erreur veuillez entrer un numéro valide");
                        sc.next();
                    }
                }
                verif = false;
                Capacite capacite = new Capacite(nomCap, precision, puissance, Type.valueOf(typeCap.toUpperCase()));
                capacites.add(capacite);
                nbOfCapacities++;
            }
            equipe.add(monPokemon);

        }
        Spectrum Pokemon1 = new Spectrum("Spectrum", 100, 128, 80, 112, capacitesAdversaire, Type.SPECTRE, "par echange");
        Kaimorse Pokemon2 = new Kaimorse("Kaimorse", 250, 150, 160, 130,  capacitesAdversaire, Type.EAU, "par monté de niveau");
        Arceus Pokemon3 = new Arceus("Arceus", 444, 372, 372, 372,  capacitesAdversaire, Type.NORMAL, "Légendaire !!!");

        adversaire.add(Pokemon1);
        adversaire.add(Pokemon2);
        adversaire.add(Pokemon3);


        System.out.println(adversaire);
        System.out.println(equipe);
    }
    public static boolean verifType(String typePoke)
    {
        boolean isAType = false;
        for (Type type : Type.values()) {
            if(typePoke.equalsIgnoreCase(type.name()))
            {
                isAType=true;
            }
        }
        return isAType;
    }
}
