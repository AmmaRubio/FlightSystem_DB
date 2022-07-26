package hello.world.demo.City;

import hello.world.demo.Flight.Flight;
import hello.world.demo.POI.POI;
import hello.world.demo.Passenger.Passenger;

import javax.persistence.*;
import java.util.List;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; // system id
    String name;
    @OneToMany(mappedBy = "departure")
    private List<Flight> isDeparture;
    @OneToMany(mappedBy = "destination")
    private List<Flight> isDestination;
    // TODO: implement map
   // List<POI> poiList; TODO: implement one to many realtionship

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //TODO: implement ToString
}
