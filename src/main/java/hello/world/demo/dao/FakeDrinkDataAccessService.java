package hello.world.demo.dao;

import hello.world.demo.drink.Drink;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeDrinkDataAccessService implements DrinkDao {

    private static List<Drink> DB = new ArrayList<>();

    @Override
    public int insertDrink(UUID id, Drink d) {
        DB.add(new Drink(id, d.getName()));
        return 1;
    }
}
