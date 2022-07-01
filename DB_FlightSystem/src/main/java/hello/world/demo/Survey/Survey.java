package hello.world.demo.Survey;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int flightRating;
    private int cateringRating;
    private int enviromentRating;
    private int serviceRating;
    private int comfortRating;
    private Long flightId;

    public Survey() {
       /* System.out.println("Rate flight (from 1 to 5):");
        this.flightRating = new Scanner(System.in).nextInt();
        System.out.println("Rate catering (from 1 to 5):");
        this.cateringRating = new Scanner(System.in).nextInt();
        System.out.println("Rate enviroment (from 1 to 5):");
        this.enviromentRating= new Scanner(System.in).nextInt();
        System.out.println("Rate service (from 1 to 5):");
        this.serviceRating = new Scanner(System.in).nextInt();
        System.out.println("Rate comfort (from 1 to 5):");
        this.serviceRating = new Scanner(System.in).nextInt();*/
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFlightRating() {
        return flightRating;
    }

    public void setFlightRating(int flightRating) {
        this.flightRating = flightRating;
    }

    public int getCateringRating() {
        return cateringRating;
    }

    public void setCateringRating(int cateringRating) {
        this.cateringRating = cateringRating;
    }

    public int getEnviromentRating() {
        return enviromentRating;
    }

    public void setEnviromentRating(int enviromentRating) {
        this.enviromentRating = enviromentRating;
    }

    public int getServiceRating() {
        return serviceRating;
    }

    public void setServiceRating(int serviceRating) {
        this.serviceRating = serviceRating;
    }

    public int getComfortRating() {
        return comfortRating;
    }


    public void setComfortRating(int comfortRating) {
        this.comfortRating = comfortRating;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public Survey(Long flightId) {
        this.flightId = flightId;
    }

    public Survey(Long id, int flightRating, int cateringRating, int enviromentRating, int serviceRating, int comfortRating, Long flightId) {
        this.id = id;
        this.flightRating = flightRating;
        this.cateringRating = cateringRating;
        this.enviromentRating = enviromentRating;
        this.serviceRating = serviceRating;
        this.comfortRating = comfortRating;
        this.flightId = flightId;
    }
}
