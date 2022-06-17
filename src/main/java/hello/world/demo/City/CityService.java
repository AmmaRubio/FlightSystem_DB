package hello.world.demo.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    CityRepository cityRepository;
@Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    public List<City> getCities(){
    return cityRepository.findAll();
    }
    public Optional<City> getCities(Long id){
    return cityRepository.findById(id);
    }
    public void addCity(City city){
    cityRepository.save(city);
    }
}
