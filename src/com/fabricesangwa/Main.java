package com.fabricesangwa;
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
        Adresse add1 = new Adresse("DU 30 JUIN", "12B", "Kamoto", "Gambela", "Lubumbashi", "    Lubumbashi", "RDC");
        Personne Michael = new Personne("TSHIPAMBA", "Michael", add1);
        Date date1 = new Date(2024,12,22);
        Produit<String> Cahier = new Produit<>("0921", "Cahier", 2.4,"Pcs", date1);

    }


}
