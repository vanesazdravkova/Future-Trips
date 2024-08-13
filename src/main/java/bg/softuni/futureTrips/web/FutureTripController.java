package bg.softuni.futureTrips.web;

import javax.validation.Valid;

import bg.softuni.futureTrips.data.AddFutureTripDto;
import bg.softuni.futureTrips.data.GetFutureTripDTO;
import bg.softuni.futureTrips.service.FutureTripService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/future-trips")
public class FutureTripController {

  private final FutureTripService futureTripService;

  public FutureTripController(FutureTripService futureTripService) {
    this.futureTripService = futureTripService;
  }

  @GetMapping("/all")
  public ResponseEntity<List<GetFutureTripDTO>> getAllFortunes(){
    return new ResponseEntity<>(futureTripService.getAllFutureTrips(), HttpStatus.OK);
  }

  @PostMapping("/add")
  @ResponseStatus(HttpStatus.CREATED)
  public void createFortune(@RequestBody @Valid AddFutureTripDto addFutureTripDto){
    futureTripService.createFutureTrip(addFutureTripDto);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteFortune(@PathVariable Long id) {
    futureTripService.deleteFutureTrip(id);
  }
}
