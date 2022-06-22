package com.fabricesangwa;

public class Facture extends DocumentCommercial{
    public Facture(long numero, Client client, Detail detail) {
        super(numero, client, detail);


    }

    @Override
    public Double getTotal() {
        double i = 0;
        for (Ligne j : getDetail().ligne){
            i += j.getPrixTotal();
        }
        return i;
    }

    @Override
    public Double getTVA() {
        return (getTotal()*0.16) +  getTotal();
    }
}
