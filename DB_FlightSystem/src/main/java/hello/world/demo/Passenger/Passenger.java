package hello.world.demo.Passenger;


import hello.world.demo.Flight.Flight;


import javax.persistence.*;
import java.util.*;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
   // private List<String> favAttractions; // TODO: implement attractions
    @ManyToMany(fetch = FetchType.LAZY,
    cascade = {CascadeType.PERSIST,
    CascadeType.MERGE})
    @JoinTable(
            name = "passenger_flight",
            joinColumns = @JoinColumn(name = "passenger_id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id"))
    private List<Flight> flights = new ArrayList<>();


    public Passenger() {
      //  this.favAttractions = new Vector<String>();
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

    public List<Flight> flights() {
        return flights;
    }
    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
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

    public List<Flight> getFlights() {
        return flights;
    }

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
