package hello.world.demo.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "city")
public class CityController {
    CityService cityService;
@Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping
    public List<City> getCities(){
    return this.cityService.getCities();
    }
    @GetMapping(path = "{id}")
    public Optional<City> getCities(@PathVariable("id")Long id){
    return this.cityService.getCities(id);
    }
    @PostMapping
    public void addCity(@RequestBody City city){
    this.cityService.addCity(city);
    }

    @GetMapping(path = "name/{name}")
    public City getCityByName(@PathVariable("name")String name){return this.cityService.getCityByName(name);}

}
