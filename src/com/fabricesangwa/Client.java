package com.fabricesangwa;

public class Client extends Personne {
    private  String numero;



    public Client(String nom, String prenom, Adresse adresse){
        super(nom, prenom, adresse);
    }

    public Client(String nom){
        super(nom);
    }

    public  Client(String nom, String prenom){
        super(nom, prenom);
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
