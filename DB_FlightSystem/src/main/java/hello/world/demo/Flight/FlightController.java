package hello.world.demo.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "flight")
public class FlightController {
    private final FlightService flightService;
    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
    @GetMapping
    public List<hello.world.demo.Flight.Flight> getFlights(){return flightService.getFlights();}
    @GetMapping(path = "{id}")
    public Optional<Flight> getFlights(@PathVariable("id") Long id){return flightService.getFlightById(id);}
    @PostMapping()
    public void registerNewFlight(@RequestBody Flight flight) {flightService.addNewFlight(flight);}
    @DeleteMapping(path = "{id}")
    public void deleteFlight(@PathVariable("id") Long id){
        flightService.deleteFlight(id);}


}
