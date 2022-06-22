package com.fabricesangwa;

public class Adresse {

   private String avenue;
   private String numero;
   private String cellule;
   private String quartier;
   private String commune;
   private String ville;
   private String pays;

   public Adresse(String avenue, String numero, String cellule, String quartier, String commune, String ville, String pays){
      this.avenue = avenue;
      this.numero = numero;
      this.cellule = cellule;
      this.quartier = quartier;
      this.commune = commune;
      this.ville = ville;
      this.pays = pays;
   }

   public String getAvenue() {
      return avenue;
   }

   public String getNumero() {
      return numero;
   }

   public String getCellule() {
      return cellule;
   }

   public String getQuartier() {
      return quartier;
   }

   public String getCommune() {
      return commune;
   }

   public String getVille() {
      return ville;
   }

   public String getPays() {
      return pays;
   }

   @Override
   public String toString() {
      return "Adresse\n===========\n"
              + "Pays : " + getPays()  + "\n"
              +  "Ville : "  +  getVille() + "\n"
              +  "Commune : " + getCommune() + "\n"
              + "Quartier : " + getQuartier() + "\n"
              +  "Cellule " + getCellule() + "\n"
              + "Avenue " + getAvenue();
   }
}
