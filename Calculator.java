package org.example;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    //Scanner erlaubt das einlesen von Datentypen
    //System.in ist die Eingabe meist über Tastatur
    Scanner scanner = new Scanner(System.in);

    System.out.println("Taschenrechner");

    System.out.print("Gib eine Zahl ein: ");
    // Scanner liest mit dem Befehl .next... den jeweiligen Datentyp
    double zahl1 = scanner.nextDouble();

    System.out.print("Gib eine weitere Zahl ein: ");
    double zahl2 = scanner.nextDouble();

    System.out.println(" Wähle einen Operator (+,-,/,*): ");
    char operator = scanner.next().charAt(0);

    double ergebnis;

    switch (operator) {
      case '+':
        ergebnis = zahl1 + zahl2;
        break;

      case '-':
        ergebnis = zahl1 - zahl2;
        break;
      case '*':
        ergebnis = zahl1 * zahl2;
        break;
      case '/':
        if (zahl2 != 0) {
          ergebnis = zahl1 / zahl2;

        } else {
          System.out.println("Man darf nicht durch 0 dividieren");
          return;
        }
        break;
      default:
        System.out.println("Ungültige Operation.");
        return;


    }
    System.out.println("Ergebnis:" + ergebnis);
    //.close schont Ressourcen, jedoch kann es bei großen Anwendungen dazu führen, dass keine
    // Eingaben mehr möglich sind
    scanner.close();

  }

}


