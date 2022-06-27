package com.fabricesangwa;

import java.io.File;

public class Client extends Personne {
    private  String numero;
    Fichier fichier = new Fichier(new File("clients.txt"));


    public Client(String nom, String prenom, Adresse adresse){
        super(nom, prenom, adresse);
        fichier.creer();
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
