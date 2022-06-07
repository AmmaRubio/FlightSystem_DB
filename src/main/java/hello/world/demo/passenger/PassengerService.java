package hello.world.demo.passenger;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    public List<Passenger> getPassengers(){
        return List.of(new Passenger("Gleb"));
    }
}
