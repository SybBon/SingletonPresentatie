package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultitonWasmand {

    private static Map<String, MultitonWasmand> manden = new HashMap<>();
    private String wasmandNaam;
    private ArrayList<String> kledingstukken = new ArrayList<>();
    // private constructor → voorkomen dat iemand 'new' kan gebruiken
    private MultitonWasmand(String wasmandNaam) {
        this.wasmandNaam = wasmandNaam;
    }

    public void voegToe(String kledingstuk) {
        kledingstukken.add(kledingstuk);
    }


    public void toonInhoud() {
        System.out.println("Inhoud van mand '" + wasmandNaam + "': " + kledingstukken);
    }

    public static void toonAlleManden() {
        for (MultitonWasmand mand : manden.values()) {
            mand.toonInhoud();
        }
    }
    // Multiton access methode
    public static MultitonWasmand getInstance(String wasmandNaam) {
        // als er nog geen mand met die naam is, maak er één aan
        if (!manden.containsKey(wasmandNaam)) {
            manden.put(wasmandNaam, new MultitonWasmand(wasmandNaam));
        }
        return manden.get(wasmandNaam);
    }
}

