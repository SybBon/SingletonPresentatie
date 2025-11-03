package model;

/**
 * @author
 * TODO
 */
public class Singleton {
    private static Singleton instance;
    private int kledingStukken;

    // Private constructor prevents instantiation from other classes
    private Singleton() {
        kledingStukken = 0;
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void addLaundry(String item) {
        kledingStukken++;
        System.out.println("Toegevoegd " + item + " Aan de huishoudelijke wasmand. Totaal items: " + kledingStukken);
    }
}

