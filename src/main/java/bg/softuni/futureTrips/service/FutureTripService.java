package bg.softuni.futureTrips.service;

import bg.softuni.futureTrips.data.AddFutureTripDto;
import bg.softuni.futureTrips.data.GetFutureTripDTO;

import java.util.List;

public interface FutureTripService {

  List<GetFutureTripDTO> getAllFutureTrips();

  GetFutureTripDTO createFutureTrip(AddFutureTripDto addFutureTripDto);

  void deleteFutureTrip(Long id);

  void initFutureTrips();
}
