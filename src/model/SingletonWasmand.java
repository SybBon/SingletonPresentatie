package model;

import java.util.ArrayList;

public class SingletonWasmand {

    private static SingletonWasmand instance; // de enige mand
    private String wasmandNaam;
    private ArrayList<String> kledingstukken = new ArrayList<>();

    private SingletonWasmand(String wasmandNaam) {
        this.wasmandNaam = wasmandNaam;
    }

    // Singleton access
    public static SingletonWasmand getInstance(String wasmandNaam) {
        if (instance == null) {
            instance = new SingletonWasmand(wasmandNaam);
        }
        return instance;
    }

    public void voegToe(String kledingstuk) {
        kledingstukken.add(kledingstuk);
    }

    public void toonInhoud() {
        System.out.println("Inhoud van de mand (" + wasmandNaam + "): " + kledingstukken);
    }

    public String getWasmandNaam() {
        return wasmandNaam;
    }
}
