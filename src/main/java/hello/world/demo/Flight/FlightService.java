package hello.world.demo.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightService {
    private final hello.world.demo.Flight.FlightRepository flightRepository;
    @Autowired
    public FlightService(hello.world.demo.Flight.FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<hello.world.demo.Flight.Flight> getFlights() {
        return flightRepository.findAll();
    }
}
