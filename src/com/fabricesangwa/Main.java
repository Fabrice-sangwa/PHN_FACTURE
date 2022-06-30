package com.fabricesangwa;

import java.text.ParseException;
import  java.util.*;

import java.util.List;

/*

Liste des membres

1. SANGWA MAYOMBO Fabrice GL
2. NDIBU KITENGE Vasthy MSI
3. MPOYO KABEYA Cynthia
4. MULENGA MULAPU Elisée
5. TSHIPAMBA BULAMBA Michael
6. MBOMBO KATEMBWE Urcilla




 */
public class Main {
    public static void main(String[] args) throws ParseException {


         //String[] noms = {(new Fichier(new File("personnes.txt")).lire())}

        //Produit<String>  pc = new Produit<>("001A2", "Ordinateur portable", 150.0, "Piece");

        Scanner in =new Scanner(System.in);


        byte choise = 0;


         //System.out.println(noms);

        System.out.println("BIENVENU DANS L'APPLICATION DE FACTURATION");
        System.out.println("*******************");
        while (choise!=2) {
            System.out.println("Veuillez indique votre choix");
            System.out.print("1. Ajouter un client\n" +
                             "2. Ajouter un article\n>");
            choise = in.nextByte();
            if (choise == 1){
                System.out.println("Veuillez renseigner le nom du client");
                String nom = in.next();
                System.out.println("Veuillez renseigner le prenom du client");
                String prenom = in.next();
                Personne personne = new Personne(nom, prenom);
                continue;
            } else if (choise == 2) {
                System.out.println("Veuilez renseigner le code de l'article");
                String code = in.next();
                System.out.println("Veuillez saisir la designation l'articel ");
                String designation = in.next();
                System.out.println("Veuillez saisir le prix de l'article, mettez la virgule");
                double prix = in.nextDouble();
                System.out.println("Veuillez renseigner l'unite de mesure");
                String unite = in.next();
                Produit<String>  produit = new Produit<>(code, designation, prix, unite);
                continue;
            }

        }





    }
}
