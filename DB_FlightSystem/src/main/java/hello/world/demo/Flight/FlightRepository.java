package hello.world.demo.Flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



@Repository
public interface FlightRepository extends JpaRepository<hello.world.demo.Flight.Flight, Long> {
    @Query()
    Optional<Flight> findFlightById(Long id);
    List<Flight> findFlightsByPassengersId(long passengerId);
}
