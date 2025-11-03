package controller;

import model.StandaardWasmand;

public class StandaardWasmandController {
    public static void main(String[] args) {

        // Iedereen gooit was in een andere wasmand
        StandaardWasmand wasVanPiet = new StandaardWasmand();
        StandaardWasmand wasVanAnna = new StandaardWasmand();

        wasVanPiet.voegToe("Piet's streepjessokken");
        wasVanAnna.voegToe("Anna's rode T-shirt");

        // Ieders was zit nu in hun eigen wasmand
        System.out.print("Mand van Piet: ");
        wasVanPiet.toonInhoud();

        System.out.print("Mand van Anna: ");
        wasVanAnna.toonInhoud();
    }
}
