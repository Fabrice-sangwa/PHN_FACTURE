package com.fabricesangwa;

import java.io.File;

public class BonDeCommande extends DocumentCommercial{

        Fichier fichier = new Fichier(new File("bonDeCommande.txt"));

    public BonDeCommande(long numero, Client client, Detail detail) {
        super(numero, client, detail);
        fichier.creer();

    }

}
