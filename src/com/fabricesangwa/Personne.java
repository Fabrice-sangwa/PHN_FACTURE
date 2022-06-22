package com.fabricesangwa;

import java.util.Locale;

public class Personne {
    private String nom;
    private String prenom;
    Adresse adresse;


    public Personne(String nom, String prenom, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Le Client : " + this.nom  + " " + this.prenom.toUpperCase()
                + "\n" + adresse.toString();
    }

}
