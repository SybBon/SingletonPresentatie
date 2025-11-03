package model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * TODO
 */

public class Multiton {
    private static Map<String, Multiton> instances = new HashMap<>();
    private int kledingStukken;
    private String kamer;

    // Private constructor
    private Multiton(String kamer) {
        this.kamer = kamer;
        kledingStukken = 0;
    }

    // Static method to get instance per room
    public static Multiton getInstance(String kamer) {
        if (!instances.containsKey(kamer)) {
            instances.put(kamer, new Multiton(kamer));
        }
        return instances.get(kamer);
    }

    public void addLaundry(String item) {
        kledingStukken++;
        System.out.println("Toegevoegd " + item + " aan de wasmand in " + kamer + ". Totaal items: " + kledingStukken);
    }
}
