package hello.world.demo.drink;

import org.springframework.beans.factory.annotation.Autowired;

public class DrinkController {

    private final DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    public void addDrink(Drink d) {
        drinkService.addDrink(d);
    }

}
