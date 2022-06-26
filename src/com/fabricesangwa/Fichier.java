package com.fabricesangwa;

import java.io.*;
public class Fichier {

    private File file;

    public Fichier(File file) {
        this.file = file;
    }

    public  void  creer (){
        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("The file has created");
            } catch (IOException e) {
                e.printStackTrace();
            }
         } else {
            System.out.println("The file exists");
        }
    }

    public void lire (){
        if (file.exists()) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String line = reader.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else  {
            System.out.println("The file has not exists");
        }
    }

    public void  ecrire (){
        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);

            for (int i = 1; i <=3 ; i++) {
                bw.write("La ligne N°" + i );
                bw.newLine();
            }
            bw.flush();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}