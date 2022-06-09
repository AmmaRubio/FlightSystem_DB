package hello.world.demo.Flight;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class FlightConfig {
    @Bean
    CommandLineRunner commandLineRunner(FlightRepository repository){
        return args ->{
            hello.world.demo.Flight.Flight LH1 = new hello.world.demo.Flight.Flight(1L,
                    "Munich",
                    "Frankfurt",
                    LocalDate.of(2022,8,12),
                    LocalTime.of(12,30),
                    LocalTime.of(14,10),
                    "LH");
            hello.world.demo.Flight.Flight LH2 = new hello.world.demo.Flight.Flight(2L,
                    "Munich",
                    "Berlin",
                    LocalDate.of(2022,8,12),
                    LocalTime.of(14,30),
                    LocalTime.of(16,10),
                    "LH");
            repository.saveAll(
                    List.of(LH1, LH2));
        };
    }
}


