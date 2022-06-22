package com.fabricesangwa;

import java.util.List;

public class Detail {
    public List<Ligne> ligne;

    public Detail(List<Ligne> ligne) {
        this.ligne = ligne;
    }

    public List<Ligne> getLigne() {
        return ligne;
    }

    public void setLigne(List<Ligne> ligne) {
        this.ligne = ligne;
    }

}
