package hello.world.demo.POI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class POIService {
    POIRepository poiRepository;
@Autowired
    public POIService(POIRepository poiRepository) {
        this.poiRepository = poiRepository;
    }

    public List<POI> getPOIs() {
       return  poiRepository.findAll();
    }
    public Optional<POI> getPOIs(Long id){
    return poiRepository.findById(id);
    }

    public void addPOI(POI poi) {
    poiRepository.save(poi);
    }
}
