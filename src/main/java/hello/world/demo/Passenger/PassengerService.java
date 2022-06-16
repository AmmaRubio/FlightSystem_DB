package hello.world.demo.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {
    PassengerRepository passengerRepository;
@Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
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
}
