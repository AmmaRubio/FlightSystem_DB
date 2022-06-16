package hello.world.demo.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "drink")
public class DrinkController {

    private final DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }
    @GetMapping
    public List<Drink> getDrinks(){
       return drinkService.getDrinks();
    }
    @GetMapping(path = "{id}")
    public Optional<Drink> getDrinks(@PathVariable("id") UUID id){
        return drinkService.getDrinks(id);
    }
    @PostMapping
    public void addDrink(@RequestBody Drink drink){
        drinkService.addDrink(drink);
    }



}
