package hello.world.demo.dao;

import hello.world.demo.drink.Drink;

import java.util.UUID;

public interface DrinkDao {

    int insertDrink(UUID id, Drink d);

    default int insertDrink(Drink d) {
        UUID id = UUID.randomUUID();
        return insertDrink(id, d);
    }

}
