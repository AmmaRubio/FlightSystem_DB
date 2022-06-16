package hello.world.demo.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DrinkService {

    private final DrinkRepository drinkRepository;

    @Autowired
    public DrinkService( DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }



    public List<Drink> getDrinks() {
    return this.drinkRepository.findAll();
    }
    public Optional<Drink> getDrinks(UUID id){
     return    drinkRepository.findById(id);
    }

    public void addDrink(Drink drink) {
        drinkRepository.save(drink);
    }
}
