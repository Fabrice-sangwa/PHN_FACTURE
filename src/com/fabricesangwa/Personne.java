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

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Le Client : " + this.nom  + " " + this.prenom.toUpperCase()
                + "\n" + adresse.toString();
    }

}
