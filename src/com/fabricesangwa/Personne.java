package com.fabricesangwa;

import java.sql.Struct;
import java.util.Locale;

public class Personne {
    private String nom;
    private String prenom;
    private Adresse adresse;

    public Personne(String nom, String prenom, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public  Personne(String nom){
        this.nom = nom;
    }

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }


    @Override
    public String toString() {
        return "Le Client : " + this.nom  + " " + this.prenom.toUpperCase()
                + "\n" + adresse.toString();
    }

    public class Adresse {

        private String avenue;
        private String numero;
        private String cellule;
        private String quartier;
        private String commune;
        private String ville;
        private String pays;

        public Adresse(String avenue, String numero, String cellule, String quartier, String commune, String ville, String pays){
            this.avenue = avenue;
            this.numero = numero;
            this.cellule = cellule;
            this.quartier = quartier;
            this.commune = commune;
            this.ville = ville;
            this.pays = pays;
        }

        public Adresse(){

        }

        public String getAvenue() {
            return avenue;
        }

        public String getNumero() {
            return numero;
        }

        public String getCellule() {
            return cellule;
        }

        public String getQuartier() {
            return quartier;
        }

        public String getCommune() {
            return commune;
        }

        public String getVille() {
            return ville;
        }

        public String getPays() {
            return pays;
        }

        public void setAvenue(String avenue) {
            this.avenue = avenue;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public void setCellule(String cellule) {
            this.cellule = cellule;
        }

        public void setQuartier(String quartier) {
            this.quartier = quartier;
        }

        public void setCommune(String commune) {
            this.commune = commune;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }

        public void setPays(String pays) {
            this.pays = pays;
        }

        @Override
        public String toString() {
            return "Adresse\n===========\n"
                    + "Pays : " + getPays()  + "\n"
                    +  "Ville : "  +  getVille() + "\n"
                    +  "Commune : " + getCommune() + "\n"
                    + "Quartier : " + getQuartier() + "\n"
                    +  "Cellule " + getCellule() + "\n"
                    + "Avenue " + getAvenue();
        }
    }


}
