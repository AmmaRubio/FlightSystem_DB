package hello.world.demo.passenger;

import java.util.List;

public class Passenger {
    private String name;
    /*
    private List<String> favAttractions;
    private List<String> flightList;
    private int passengerID;
     */
    public Passenger(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
