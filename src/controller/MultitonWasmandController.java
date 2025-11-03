package controller;

import model.MultitonWasmand;

import java.util.Scanner;



public class MultitonWasmandController {
    public static void main(String[] args) {

        Scanner toetsenbord = new Scanner(System.in);


        for (int invoeren = 0; invoeren < 5; invoeren++) {
            System.out.println("Wat wil je bij de was doen?");

            System.out.print("Wasmand: ");
            String naam = toetsenbord.next();



            System.out.print("Kledingstuk: ");
            String kledingstuk = toetsenbord.next();
            MultitonWasmand wasmand = MultitonWasmand.getInstance(naam);
            wasmand.voegToe(kledingstuk);
        }
        System.out.println();
        System.out.println("Overzicht van de was:");
        MultitonWasmand.toonAlleManden();
    }
}

