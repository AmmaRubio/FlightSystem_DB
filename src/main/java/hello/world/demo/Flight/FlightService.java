package hello.world.demo.Flight;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<hello.world.demo.Flight.Flight> getFlights() {
        return flightRepository.findAll();
    }
    public void  addNewFlight(Flight flight) {
        flightRepository.save(flight);
    }

    public void deleteFlight(Long id) {
        boolean exists = flightRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("there is no flight with" + id +" id");
        }
        else {
            flightRepository.deleteById(id);
        }
    }

    public Optional<Flight> getFlightById(Long id) {
        return flightRepository.findFlightById(id);
    }
}
