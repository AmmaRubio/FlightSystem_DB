package hello.world.demo.City;

import hello.world.demo.POI.POI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; // system id
    String name;
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
