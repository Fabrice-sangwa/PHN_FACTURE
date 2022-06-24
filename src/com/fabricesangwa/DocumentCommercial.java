package com.fabricesangwa;


import java.util.ArrayList;

public abstract class DocumentCommercial {
    private long numero;
    private Client client;
    private Detail detail;

    public DocumentCommercial(long numero, Client client, Detail detail) {
        this.numero = numero;
        this.client = client;
        this.detail = detail;
    }

    public long getNumero() {
        return numero;
    }

    public  double getTotal(){
        double total = 0.0;
        for (Ligne i : detail.ligne){
            total += i.getPrixTotal();
        }
        return total;
    }
    
    public double getTVA(){
        return this.getTotal() * 0.16;
    }

    public class Detail{
        public ArrayList<Ligne> ligne = new ArrayList<Ligne>();
    }
}
