package hello.world.demo.Flight;

//import hello.world.demo.passenger.Passenger; TODO: implement passenger

import com.fasterxml.jackson.annotation.JsonIgnore;
import hello.world.demo.City.City;
import hello.world.demo.Passenger.Passenger;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "departure_id")
    private City departure;
    @ManyToOne
    @JoinColumn(name = "destination_id")
    private City destination;// TODO: change Class to city
    private LocalDate date;
    private LocalTime departureTime; // TODO: change naming in UML class diagram
    private LocalTime destinationTime;
    private String company;
    @Transient
    private Duration flightDuration;
    //TODO: solve error - how to link "passengers" and "Survey" with flight in database 31-34 - classes itself should be implemented correctly
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "flights")
    @JsonIgnore
    private List<Passenger> passengers = new ArrayList<>();
    // private List<Passenger> passengers; TODO: implement PassengerList, when class is correctly implemented
 //  private List<Survey> surveyList; TODO: implement Survey class DB first

    public Flight() {
    }

    public Flight(Long id, City departure, City destination,
                  LocalDate date, LocalTime departureTime,
                  LocalTime destinationTime, String company) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.departureTime = departureTime;
        this.destinationTime = destinationTime;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public City getDeparture() {
        return departure;
    }

    public void setDeparture(City departure) {
        this.departure = departure;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getDestinationTime() {
        return destinationTime;
    }

    public void setDestinationTime(LocalTime destinationTime) {
        this.destinationTime = destinationTime;
    }

    public String getCompany() {
        return company;
    }
    public Duration getFlightDuration(){
        return Duration.between(this.departureTime,this.destinationTime);
    }

    public void setCompany(String company) {
        this.company = company;
    }
    //TODO: implement survey
   /* public Survey getSurvey() {
        return survey;
    }

    /*public void setSurvey(Survey survey) {
        this.survey = survey;
    }
    public List<Survey> getSurveyList() {
        return surveyList;
    }

    public void setSurveyList(List<Survey> surveyList) {
        this.surveyList = surveyList;
    }

    public void rateFlight(){
        surveyList.add(new Survey(this.id));
    }
    */
    //TODO: implement passenger

//TODO: implement passenger and survey in ToString()

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departure='" + departure.getName() + '\'' +
                ", destination='" + destination.getName() + '\'' +
                ", date=" + date +
                ", departureTime=" + departureTime +
                ", destinationTime=" + destinationTime +
                ", company='" + company + '\'' +
                ", flightDuration=" + flightDuration +
               // ", surveyList=" + surveyList +
               // ", passengers=" + passengers +
                '}';
    }

}

