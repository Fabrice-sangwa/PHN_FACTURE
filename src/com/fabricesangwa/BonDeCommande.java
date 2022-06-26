package com.fabricesangwa;

import java.io.File;

public class BonDeCommande extends DocumentCommercial{
        File file = new File("bonDeCommande.txt");
        Fichier fichier = new Fichier(file);

    public BonDeCommande(long numero, Client client, Detail detail) {
        super(numero, client, detail);
        fichier.creer();

    }

}
