package hello.world.demo.Passenger;

import hello.world.demo.Flight.Flight;
import hello.world.demo.Flight.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {
    PassengerRepository passengerRepository;
    FlightRepository flightRepository;
@Autowired
    public PassengerService(PassengerRepository passengerRepository, FlightRepository flightRepository) {
        this.passengerRepository = passengerRepository;
        this.flightRepository= flightRepository;
    }

    public List<Passenger> getPassengers(){
        return passengerRepository.findAll();
    }
    public Optional<Passenger> getPassengers(Long id){
        return passengerRepository.findById(id);
    }

    public void addPassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }

    public List<Flight> getAllFlightsById(Long id) {
    return this.flightRepository.findFlightsByPassengersId(id);
    }
}
