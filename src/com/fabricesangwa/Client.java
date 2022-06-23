package com.fabricesangwa;

public class Client extends Personne {
    private  String numero;

    public Client(String nom, String prenom, Adresse adresse, String numero) {
        super(nom, prenom, adresse);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
