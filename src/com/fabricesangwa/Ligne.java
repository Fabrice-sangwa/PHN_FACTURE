package com.fabricesangwa;

import mesure.UniteMesure;

public class Ligne{
    private  int numero;
    private  int quantite;
    private Produit<UniteMesure> produit;

    public Ligne(int quantite, Produit<UniteMesure> produit) {
        this.quantite = quantite;
        this.produit = produit;
    }

    public Ligne(int numero, int quantite, Produit<UniteMesure> produit){
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

    public Produit<UniteMesure> getProduit() {

        return produit;
    }

    public void setProduit(Produit<UniteMesure> produit) {
        this.produit = produit;
    }

    public Double getPrixTotal(){
        return getQuantite() * produit. getPrix();
    }


}