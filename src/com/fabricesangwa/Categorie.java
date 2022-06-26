package com.fabricesangwa;

import java.io.File;

public class Categorie {
    private String designation;
    private String description = "";
    File file = new File("categorie.txt");
    Fichier fichier = new Fichier(file);

    public Categorie(String designation, String description) {
        this.designation = designation;
        this.description = description;
        fichier.creer();
    }

    public Categorie(String designation) {
        this.designation = designation;
    }

    public Categorie(){

    }

    public String getDesignation() {

        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
