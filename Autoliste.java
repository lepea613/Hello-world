package org.example;

import java.util.ArrayList;

public class Autoliste {
  private ArrayList <Auto> autos;

  public Autoliste (){
    this.autos = new ArrayList<>();
  }

  public void autosHinzufuegen(Auto auto) {
    autos.add(auto);
  }

  public void autosAnzeigen(){
    System.out.println("Autos auf der Liste: ");
    for (Auto auto : autos){
      auto.details();
    }
  }
}
