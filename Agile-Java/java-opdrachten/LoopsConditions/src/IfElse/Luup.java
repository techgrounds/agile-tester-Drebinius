package IfElse;

public class Luup {
    public static void main(String[] args) {
        int amount = 33;


        if (amount % 3 == 0 && amount % 2 != 0) {
            System.out.println(amount + " is deelbaar door 3, maar niet door 2");                       //ODPR1.4  if amount < 30 "amt < 30" prints, if not the else block engages and prints "ACTIVATION"
        } else if (amount % 3 != 0 && amount % 2 == 0) {
            System.out.println(amount + " is deelbaar door 2, maar niet door 3");
        } else if (amount % 3 == 0 && amount % 2 == 0) {
            System.out.println(amount + " is deelbaar door zowel 2 als 3");
        } else if (amount % 3 != 0 && amount % 2 != 0) {
            System.out.println(amount + " is niet deelbaar door 2 of 3");
        }  if (amount < 30) {
            System.out.println("amt is <  30");
        } else {
            System.out.println("ACTIVATION");                                                                               //OPDR1.5 hier een switch van maken is te veel moeite. betekent dat je voor elk getal ( 0-***** )
                                                                                                                                                        // een case moet maken, en ook (indien mogelijk) cases voor multiple condition values
        }
    }
}

  /* if (amount%3 == 0) {
            System.out.println(amount + " is deelbaar door 3");                               //OPDR1.1
              if (amount%2 != 0) {
                  System.out.println(amount + " is niet deelbaar door 2");                  //ODPR1.2
              }
        } else {
            System.out.println("idk what to do"); */

    /*
        if (amount%3 == 0 && amount%2 != 0) {
            System.out.println(amount + " is deelbaar door 3, maar niet door 2");   //ODPR1.3
        } else if (amount%3 != 0 && amount%2 == 0){
            System.out.println(amount + " is deelbaar door 2, maar niet door 3");
        } else if (amount%3 == 0 && amount%2 == 0) {
            System.out.println(amount + " is deelbaar door zowel 2 als 3" );
        } else if (amount%3 != 0 && amount%2 != 0) {
            System.out.println(amount + " is niet deelbaar door 2 of 3" );
        } */