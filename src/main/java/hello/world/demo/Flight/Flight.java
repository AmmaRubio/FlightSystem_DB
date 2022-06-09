package hello.world.demo.Flight;

//import hello.world.demo.passenger.Passenger; TODO: implement passenger

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Table
public class Flight {
    @Id
    @GeneratedValue
    private Long id;
    private String departure;
    private String destination;// TODO: change Class to city
    private LocalDate date;
    private LocalTime departureTime; // TODO: change naming in UML class diagram
    private LocalTime destinationTime;
    private String company;
//private Passenger passenger; TODO: implement passanger
//private Survey survey; //TODO: implement survey

    public Flight() {
    }

    public Flight(Long id, String departure, String destination,
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

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
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

    public void setCompany(String company) {
        this.company = company;
    }
    //TODO: implement survey
   /* public Survey getSurvey() {
        return survey;
    }

    /*public void setSurvey(Survey survey) {
        this.survey = survey;
    }*/
//
    //TODO: implement passenger
   /* public Passenger getPassenger() {
        return passenger;
    }

    public Passenger setPassenger(Passenger passenger) {
       return this.passenger = passenger;
    }*/
//TODO: implement passenger in ToString()
    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", departureTime=" + departureTime +
                ", destinationTime=" + destinationTime +
                ", company='" + company + '\'' +
                // ", survey=" + survey +
                '}';
    }
}

