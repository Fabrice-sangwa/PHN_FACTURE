package com.fabricesangwa;

import java.io.File;

public abstract class Devis extends  DocumentCommercial{

    File file = new File("devis.txt");
    Fichier fichier = new Fichier(file);
    public Devis(long numero, Client client, Detail detail) {
        super(numero, client, detail);
        fichier.creer();
    }

}
