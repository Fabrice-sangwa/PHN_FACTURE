package com.fabricesangwa;

import java.io.File;

public abstract class Devis extends  DocumentCommercial{

    Fichier fichier = new Fichier(new File("devis.txt"));
    public Devis(long numero, Client client, Detail detail) {
        super(numero, client, detail);
        fichier.creer();
    }

}
