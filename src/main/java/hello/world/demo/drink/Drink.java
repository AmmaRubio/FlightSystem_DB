package hello.world.demo.drink;

import java.util.UUID;

public class Drink {

    private UUID id;
    private String name;
    private float price;

    public Drink(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Drink(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
