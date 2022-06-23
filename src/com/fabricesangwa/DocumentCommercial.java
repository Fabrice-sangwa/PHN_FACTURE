package com.fabricesangwa;


public abstract class DocumentCommercial {
    private long numero;
    Client client;
    Detail detail;

    public DocumentCommercial(long numero, Client client, Detail detail) {
        this.numero = numero;
        this.client = client;
        this.detail = detail;
    }

    public long getNumero() {
        return numero;
    }

    public Client getClient() {
        return client;
    }


    public Detail getDetail() {
        return detail;
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
}
