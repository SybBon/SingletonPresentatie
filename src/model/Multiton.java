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
    private String room;

    // Private constructor
    private Multiton(String room) {
        this.room = room;
        kledingStukken = 0;
    }

    // Static method to get instance per room
    public static Multiton getInstance(String room) {
        if (!instances.containsKey(room)) {
            instances.put(room, new Multiton(room));
        }
        return instances.get(room);
    }

    public void addLaundry(String item) {
        kledingStukken++;
        System.out.println("Toegevoegd " + item + " aan de wasmand in " + room + ". Totaal items: " + kledingStukken);
    }
