package hello.world.demo.Passenger;

import hello.world.demo.Flight.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="passenger")
public class PassengerController {

    private final PassengerService passengerService;

    @Autowired
    public PassengerController(PassengerService passengerService){
        this.passengerService = passengerService;
    }

    @GetMapping
    public List<Passenger> getPassengers(){
        return passengerService.getPassengers();
    }
    @GetMapping(path = "{id}")
    public Optional<Passenger> getPassengers(@PathVariable("id")Long id){
        return passengerService.getPassengers(id);
    }
    @PostMapping
    public void addPassenger(@RequestBody Passenger passenger){
        this.passengerService.addPassenger(passenger);
    }
    @GetMapping("/{id}/flight")
    public List<Flight> getAllFlightsByPassengerId(@PathVariable(value = "id")Long id){
        return this.passengerService.getAllFlightsById(id);
    }
}
