package com.fabricesangwa;

public class Ligne{
    private  int numero;
    private  int quantite;
    Produit produit;

    public Ligne(int numero, int quantite, Produit produit) {
        this.numero = numero;
        this.quantite = quantite;
        this.produit = produit;
    }

    public int getNumero() {
        return numero;
    }

    public int getQuantite() {
        return quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public Double getPrixTotal(){
        return getQuantite() * produit.getPrix();
    }


}