package com.fabricesangwa;
import java.io.File;
import java.io.IOException;
import  java.util.*;

import java.util.List;

/*

Liste des membres

1. SANGWA MAYOMBO Fabrice GL
2. NDIBU KITENGE Vasthy MSI
3. MPOYO KABEYA Cynthia
4. MULENGA MULAPU Elisée
5. TSHIPAMBA BULAMBA Michael
6. MBOMBO KATEMBWE Ursula



 */
public class Main {
    public static void main(String[] args) {
     File file = new File("Fichier.txt");
     Fichier fichier = new Fichier(file);
     fichier.creer();
     fichier.ecrire();
     fichier.lire();
    }


}
