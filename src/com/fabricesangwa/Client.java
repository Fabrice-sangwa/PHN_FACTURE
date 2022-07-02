package com.fabricesangwa;

import java.io.File;

public class Client extends Personne {
    private  String numero;
    Fichier fichier = new Fichier(new File("clients.txt"));


    public Client(String nom, String prenom, String numero, Personne.Adresse adresse){
        super(nom, prenom, numero, adresse);
        fichier.creer();
        fichier.ecrire(nom + " " + prenom + " " +
                            numero + " " + adresse.getPays()  + " " +
                            adresse.getVille() + " " +
                            adresse.getCommune() + " " +
                            adresse.getQuartier() + " " +
                            adresse.getCellule() + " " +
                            adresse.getAvenue() + " " +
                            adresse.getNumero());
    }




    public Client(String nom){
        super(nom);
        fichier.creer();
    }

    public  Client(String nom, String prenom){
        super(nom, prenom);
        fichier.creer();
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
