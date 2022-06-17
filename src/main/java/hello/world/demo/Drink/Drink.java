package hello.world.demo.Drink;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;
@Entity
public class Drink {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private float price;

    public Drink() {
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
