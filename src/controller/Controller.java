package controller;

import model.Multiton;
import model.Singleton;
import model.Standard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Annelies Hofman
 * TODO
 */
public class Controller {
    public static void main(String[] args) {
        System.out.println("=== Singleton voorbeeld ===");
        Singleton sharedBasket1 = Singleton.getWasmand();
        Singleton sharedBasket2 = Singleton.getWasmand();
        sharedBasket1.addLaundry("T-shirt");
        sharedBasket2.addLaundry("Jeans");

        System.out.println("\n=== Multiton voorbeeld ===");
        Multiton slaapkamerMand = Multiton.getInstance("Slaapkamer");
        Multiton badkamerMand = Multiton.getInstance("Badkamer");
        Multiton babykamerMand = Multiton.getInstance("Babykamer");
        slaapkamerMand.addLaundry("Sokken");
        badkamerMand.addLaundry("Handdoek");
        babykamerMand.addLaundry("Pajamas");

        System.out.println("\n=== Standard voorbeeld ===");
        Standard mandVanAnne = new Standard("Anne");
        Standard mandVanBob = new Standard("Bob");
        mandVanAnne.addLaundry("Jurk");
        mandVanBob.addLaundry("Shirt");
    }


}
