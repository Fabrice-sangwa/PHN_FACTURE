package com.fabricesangwa;

import mesure.UniteMesure;

import java.io.File;

public class Ligne{
    private  int numero;
    private  int quantite;
    private Produit<UniteMesure> produit;

    File file = new File("ligne.txt");
    Fichier fichier = new Fichier(file);

    public Ligne(int quantite, Produit<UniteMesure> produit) {
        this.quantite = quantite;
        this.produit = produit;
        fichier.creer();
    }

    public Ligne(int numero, int quantite, Produit<UniteMesure> produit){
        this.numero = numero;
        this.quantite = quantite;
        this.produit = produit;
        fichier.creer();
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