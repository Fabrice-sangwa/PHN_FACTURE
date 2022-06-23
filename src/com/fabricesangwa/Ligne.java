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

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Double getPrixTotal(){
        return this.getQuantite() * this.produit.getPrix();
    }


}