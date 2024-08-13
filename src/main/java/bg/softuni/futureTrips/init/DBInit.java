package bg.softuni.futureTrips.init;

import bg.softuni.futureTrips.service.FutureTripService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {

  private final FutureTripService futureTripService;

  public DBInit(FutureTripService futureTripService) {
    this.futureTripService = futureTripService;
  }


  @Override
  public void run(String... args) throws Exception {
    this.futureTripService.initFutureTrips();
  }
}
