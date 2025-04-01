package org.example;

public class Main {
  public static void main(String[] args) {
    Autoliste autoliste = new Autoliste();

    Auto auto1 = new Auto("VW", "Golf", 2019, 29590 );
    Auto auto2 = new Auto("Opel", "Astra", 2021, 24000);
    Auto auto3 = new Auto("BMW", "X1", 2022, 43900);

    autoliste.autosHinzufuegen(auto1);
    autoliste.autosHinzufuegen(auto2);
    autoliste.autosHinzufuegen(auto3);

    autoliste.autosAnzeigen();
  }
}

