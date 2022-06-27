package com.fabricesangwa;

import java.io.File;

public class Facture extends DocumentCommercial{
    Fichier fichier = new Fichier(new File("facture.txt"));
    public Facture(long numero, Client client, Detail detail) {
        super(numero, client, detail);
        fichier.creer();
    }
}
