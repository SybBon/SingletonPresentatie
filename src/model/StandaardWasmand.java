package model;

import java.util.ArrayList;

public class StandaardWasmand {

    // lijst van was in wasmand
    private ArrayList<String> kledingstukken = new ArrayList<>();

    // doe was bij de was
    public void voegToe(String kledingstuk) {
        kledingstukken.add(kledingstuk);
    }

    // toon inhoud van de wasmand
    public void toonInhoud() {
        System.out.println("Inhoud van de mand: " + kledingstukken);
    }
}
