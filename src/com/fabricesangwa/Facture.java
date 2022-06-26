package com.fabricesangwa;

import java.io.File;

public class Facture extends DocumentCommercial{
    File file = new File("facture.txt");
    Fichier fichier = new Fichier(file);
    public Facture(long numero, Client client, Detail detail) {
        super(numero, client, detail);
        fichier.creer();
    }
}
