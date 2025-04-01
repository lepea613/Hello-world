package org.example;

public class Auto {
      private String modell;
      private String marke;
      private int baujahr;
      private double preis;

      private int id;

      //Konstruktor
      public Auto (String marke, String modell, int baujahr, double preis){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.preis = preis;
        this.id = id;

      }
      public String getMarke(){
        return marke;
      }

      public  String getModell(){
        return modell;
      }

      public int getBaujahr() {
        return baujahr;
      }

      public double getPreis() {
        return preis;
      }

      public int getId() {
        return id;
      }

  public void details(){
    System.out.println("Auto: " + marke + " " + modell + " (" + baujahr + ")" + " kostet " + preis);
      }

}
