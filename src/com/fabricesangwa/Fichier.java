package com.fabricesangwa;

import java.io.*;
import java.util.Scanner;

public class Fichier {

    private File file;
    private FileWriter fileWriter;

    public Fichier(File file) {
        this.file = file;
    }

    public  void  creer (){
        if(!file.exists()){
            try {
                file.createNewFile();
                 // System.out.println("The file has created");
            } catch (IOException e) {
                e.printStackTrace();
            }
         } else {
            System.out.println("The file exists");
        }
    }

    public void  ecrire (String texte){
        if (file.exists()){
            try {
                this.fileWriter = new  FileWriter(this.file, true);
                this.fileWriter.append("\n" + texte);
                this.fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The not exists");
        }

    }

    public String lire (){
        if (file.exists()) {
            try{
                Scanner scanner = new Scanner(this.file);
                while (scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
                scanner.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else  {
            System.out.println("The file has not exists");
        }
        return null;
    }

}