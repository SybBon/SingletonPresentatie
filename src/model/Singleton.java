package model;

/**
 * @author
 * TODO
 */
public class Singleton {
    private static Singleton wasmand;
    private int kledingStukken;

    // Private constructor
    private Singleton() {
        kledingStukken = 0;
    }

    // Public method to provide access
    public static Singleton getWasmand() {
        if (wasmand == null) {
            wasmand = new Singleton();
        }
        return wasmand;
    }

    public void addLaundry(String item) {
        kledingStukken++;
        System.out.println("Toegevoegd " + item + " Aan de huishoudelijke wasmand. Totaal items: " + kledingStukken);
    }
}

