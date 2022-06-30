package com.fabricesangwa;

import java.io.File;
import java.util.Date;

public class Produit <T> {
    private String code;
    private String designation;
    private Double prix;
    private T uniteMesure;
    private Date dateExpriration;

    private  Categorie categorie;

    Fichier fichier = new Fichier(new File("produit.txt"));

    public Produit(String code, String designation, Double prix, T uniteMesure, Date dateExpriration) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.uniteMesure =  uniteMesure;
        this.dateExpriration = dateExpriration;
        fichier.creer();
    }
    public Produit(String code, String designation, Double prix, T uniteMesure) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.uniteMesure =  uniteMesure;
        fichier.creer();
        fichier.ecrire(code + " " + designation + " " + prix + " " + uniteMesure );
    }

    public String getCode() {
        return code;
    }

    public String getDesignation() {
        return designation;
    }

    public Double getPrix() {
        return prix;
    }

    public T getUniteMesure() {
        return uniteMesure;
    }

    public Date getDateExpriration() {
        return dateExpriration;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setUniteMesure(T uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    public void setDateExpriration(Date dateExpriration) {
        this.dateExpriration = dateExpriration;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
