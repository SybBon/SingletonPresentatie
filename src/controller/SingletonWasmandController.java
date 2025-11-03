package controller;

import model.SingletonWasmand;

import java.util.Scanner;



public class SingletonWasmandController {
    public static void main(String[] args) {

        Scanner toetsenbord = new Scanner(System.in);


        for (int invoeren = 0; invoeren < 5; invoeren++) {
            System.out.println("Wat wil je bij de was doen?");

            System.out.print("Wasmand: ");
            String naam = toetsenbord.next();






            System.out.print("Kledingstuk: ");
            String kledingstuk = toetsenbord.next();
            SingletonWasmand wasmand = SingletonWasmand.getInstance(naam);
            wasmand.voegToe(kledingstuk);
        }

        System.out.println("");
        System.out.println("\nOverzicht van de wasmand:");
        SingletonWasmand.getInstance("maakt niet uit").toonInhoud();
    }

}
