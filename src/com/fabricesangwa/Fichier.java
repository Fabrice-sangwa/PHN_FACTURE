package com.fabricesangwa;

import  java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Fichier {

    private String chemin;
    private File file;
    private FileWriter fileWriter;

    public  void creer(){
        try {
            if(this.file.createNewFile()) {
                System.out.println("Le Fichier a bien ete creer");
            } else {
                System.out.println("Quelque chose s'est mal passe");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }






}
