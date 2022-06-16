package hello.world.demo.Passenger;


import hello.world.demo.Flight.Flight;
import org.springframework.web.bind.annotation.PathVariable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Passenger {
    private String firstName;
    private String secondName;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

   // private List<String> favAttractions; // TODO: implement attractions
    //private List<Flight> bookedFlights; //


    public Passenger() {
      //  this.favAttractions = new Vector<String>();
       // this.bookedFlights = new Vector<Flight>();
        this.firstName = "NA";
        this.secondName = "NA";
    }
    public Passenger(String FirstName, String secondName) {
        this.firstName = FirstName;
        this.secondName = secondName;
       // this.favAttractions = new Vector<String>();
        //this.bookedFlights = new Vector<Flight>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /*public List<String> getFavAttractions() {
        return favAttractions;
    }

    public void setFavAttractions(List<String> favAttractions) {
        this.favAttractions = favAttractions;
    }

    public List<Flight> getBookedFlights() {
        return bookedFlights;
    }

    public void setBookedFlights(List<Flight> bookedFlights) {
        this.bookedFlights = bookedFlights;
    }
*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
/*public void bookFlight(Flight flight){
        this.bookedFlights.add(flight);
}
public void removeFlight(Flight flight){
        this.bookedFlights.remove(flight);
}
public void addPOI(String POI){
        this.favAttractions.add(POI);
}

 */
    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
               // ", favAttractions=" + favAttractions +
               // ", bookedFlights=" + bookedFlights +
                ", id=" + id +
                '}';
    }
}
