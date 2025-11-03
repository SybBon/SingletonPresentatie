package model;

/**
 * @author
 * TODO
 */
public class Standard {
    private int kledingStukken;
    private String owner;

    public Standard(String owner) {
        this.owner = owner;
        kledingStukken = 0;
    }

    public void addLaundry(String item) {
        kledingStukken++;
        System.out.println("Toegevoegd " + item + " aan " + owner + "'s wasmand. Totaal items: " + kledingStukken);
    }

}
