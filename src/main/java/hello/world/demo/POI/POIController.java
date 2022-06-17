package hello.world.demo.POI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "POI")
public class POIController {
    POIService poiService;
@Autowired
    public POIController(POIService poiService) {
        this.poiService = poiService;
    }
    @GetMapping
    public List<POI> getPOIs(){
    return this.poiService.getPOIs();
    }
    @GetMapping(path = "{id}")
    public Optional<POI> getPOIs(@PathVariable("id")Long id){
    return this.poiService.getPOIs(id);
    }
    @PostMapping
    public void addPOI(@RequestBody POI poi){
    this.poiService.addPOI(poi);
    }
}
