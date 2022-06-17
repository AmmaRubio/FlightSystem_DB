package hello.world.demo.POI;

import hello.world.demo.City.City;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.stream.Location;
@Entity
public class POI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; //for DB local purposes
    //Location geoLocation; TODO: implement Location - issue: not premitive type
    String mainInformation;
  //  City city; TODO: implement one-To_Many relationship

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public Location getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(Location geoLocation) {
        this.geoLocation = geoLocation;
    }
*/
    public String getMainInformation() {
        return mainInformation;
    }

    public void setMainInformation(String mainInformation) {
        this.mainInformation = mainInformation;
    }

    @Override
    public String toString() {
        return "POI{" +
                "id=" + id +
               // ", geeCoordinates=" + geoLocation +
                ", mainInformation='" + mainInformation + '\'' +
                '}';
    }
}
