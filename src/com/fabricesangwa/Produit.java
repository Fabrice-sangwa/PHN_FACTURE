package com.fabricesangwa;

import java.util.Date;

public class Produit <T> {
    private String code;
    private String designation;
    private Double prix;
    private T uniteMesure;
    private Date dateExpriration;

    public Produit(String code, String designation, Double prix, T uniteMesure, Date dateExpriration) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.uniteMesure =  uniteMesure;
        this.dateExpriration = dateExpriration;
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


}
