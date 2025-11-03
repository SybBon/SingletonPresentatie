package controller;

import model.StandaardWasmand;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StandaardWasmandController {
    public static void main(String[] args) {

//        // Iedereen gooit was in een andere wasmand
//        StandaardWasmand wasVanPiet = new StandaardWasmand();
//        StandaardWasmand wasVanAnna = new StandaardWasmand();
//
//        wasVanPiet.voegToe("Piet's streepjessokken");
//        wasVanAnna.voegToe("Anna's rode T-shirt");
//
//        // Ieders was zit nu in hun eigen wasmand
//        System.out.print("Mand van Piet: ");
//        wasVanPiet.toonInhoud();
//
//        System.out.print("Mand van Anna: ");
//        wasVanAnna.toonInhoud();


        Scanner toetsenbord = new Scanner(System.in);
        Map<String, StandaardWasmand> wasmanden = new HashMap<>();

        for (int invoeren = 0; invoeren < 5; invoeren++) {
            System.out.println("Wat wil je bij de was doen?");

            System.out.print("Wasmand: ");
            String naam = toetsenbord.next();

            StandaardWasmand wasmand = wasmanden.get(naam);
            if (wasmand == null) {
                wasmand = new StandaardWasmand(naam);
                wasmanden.put(naam, wasmand);
            }

            System.out.print("Kledingstuk: ");
            String kledingstuk = toetsenbord.next();
            wasmand.voegToe(kledingstuk);
        }

        System.out.println("");
        System.out.println("\nOverzicht van alle wasmanden:");
        for (StandaardWasmand mand : wasmanden.values()) {
            System.out.print(mand.getWasmandNaam() + ": ");
            mand.toonInhoud();
        }

    }
}
