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
        System.out.println("=== Singleton Example ===");
        Singleton sharedBasket1 = Singleton.getWasmand();
        Singleton sharedBasket2 = Singleton.getWasmand();
        sharedBasket1.addLaundry("T-shirt");
        sharedBasket2.addLaundry("Jeans");

        System.out.println("\n=== Multiton Example ===");
        Multiton bedroomBasket = Multiton.getInstance("Bedroom");
        Multiton bathroomBasket = Multiton.getInstance("Bathroom");
        Multiton anotherBedroomBasket = Multiton.getInstance("Bedroom");
        bedroomBasket.addLaundry("Socks");
        bathroomBasket.addLaundry("Towel");
        anotherBedroomBasket.addLaundry("Pajamas");

        System.out.println("\n=== Standard Example ===");
        Standard aliceBasket = new Standard("Alice");
        Standard bobBasket = new Standard("Bob");
        aliceBasket.addLaundry("Dress");
        bobBasket.addLaundry("Shirt");
    }


}
