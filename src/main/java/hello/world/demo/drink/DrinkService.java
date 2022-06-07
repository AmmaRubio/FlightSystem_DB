package hello.world.demo.drink;

import hello.world.demo.dao.DrinkDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {

    private final DrinkDao drinkDao;

    @Autowired
    public DrinkService(@Qualifier("fakeDao") DrinkDao drinkDao) {
        this.drinkDao = drinkDao;
    }

    public int addDrink(Drink drink) {
        return drinkDao.insertDrink(drink);
    }

}
