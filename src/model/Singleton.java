package model;

/**
 * @author
 * TODO
 */
public class Singleton {
    private static Singleton washand;
    private int kledingStukken;

    // Private constructor prevents instantiation from other classes
    private Singleton() {
        kledingStukken = 0;
    }

    // Public method to provide access to the single instance
    public static Singleton getWashand() {
        if (washand == null) {
            washand = new Singleton();
        }
        return washand;
    }

    public void addLaundry(String item) {
        kledingStukken++;
        System.out.println("Toegevoegd " + item + " Aan de huishoudelijke wasmand. Totaal items: " + kledingStukken);
    }
}

