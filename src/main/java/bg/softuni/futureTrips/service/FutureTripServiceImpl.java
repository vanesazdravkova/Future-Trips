package bg.softuni.futureTrips.service;
import java.util.List;

import bg.softuni.futureTrips.data.AddFutureTripDto;
import bg.softuni.futureTrips.data.FutureTripEntity;
import bg.softuni.futureTrips.data.FutureTripRepository;
import bg.softuni.futureTrips.data.GetFutureTripDTO;
import bg.softuni.futureTrips.exception.EntityNotFoundException;
import bg.softuni.futureTrips.util.FutureTripMapper;
import org.springframework.stereotype.Service;

@Service
public class FutureTripServiceImpl implements FutureTripService {

  private final FutureTripRepository futureTripRepository;
  private final FutureTripMapper mapper;

  public FutureTripServiceImpl(FutureTripRepository futureTripRepository, FutureTripMapper mapper) {
    this.futureTripRepository = futureTripRepository;
    this.mapper = mapper;
  }

  @Override
  public List<GetFutureTripDTO> getAllFutureTrips() {
    return mapper.map(futureTripRepository.findAll());
  }

  @Override
  public GetFutureTripDTO createFutureTrip(AddFutureTripDto addFutureTripDto) {
    return mapper.map(futureTripRepository.save(mapper.map(addFutureTripDto)));
  }

  @Override
  public void deleteFutureTrip(Long id) {
    FutureTripEntity futureTripEntity = futureTripRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Future trip"));

    futureTripRepository.delete(futureTripEntity);
  }

  @Override
  public void initFutureTrips() {
    if (futureTripRepository.count() != 0) {
      return;
    }

    futureTripRepository.saveAll(List.of(
        new FutureTripEntity()
            .setName("Romantic trip in France")
            .setDestination("Paris")
            .setCompany("Rual travel")
            .setDays(5)
            .setPrice(1500),
        new FutureTripEntity()
            .setName("Ski trip in the Alps")
            .setDestination("Switzerland")
            .setCompany("Rual travel")
            .setDays(7)
            .setPrice(2000),
        new FutureTripEntity()
            .setName("Safari in Africa")
            .setDestination("Kenya")
            .setCompany("Bohemia")
            .setDays(10)
            .setPrice(3000),
        new FutureTripEntity()
            .setName("Cruise in the Caribbean")
            .setDestination("Barbados")
            .setCompany("Bohemia")
            .setDays(14)
            .setPrice(4000),
        new FutureTripEntity()
            .setName("Hiking in the Himalayas")
            .setDestination("Nepal")
            .setCompany("Oasis travel agency")
            .setDays(21)
            .setPrice(5000),
        new FutureTripEntity()
            .setName("City break in Rome")
            .setDestination("Italy")
            .setCompany("Rual travel")
            .setDays(3)
            .setPrice(1000),
        new FutureTripEntity()
            .setName("Beach vacation in Thailand")
            .setDestination("Phuket")
            .setCompany("Bohemia")
            .setDays(7)
            .setPrice(2000),
        new FutureTripEntity()
            .setName("Cultural trip in Japan")
            .setDestination("Tokyo")
            .setCompany("Bohemia")
            .setDays(10)
            .setPrice(3000),
        new FutureTripEntity()
            .setName("Ski trip in the Andes")
            .setDestination("Chile")
            .setCompany("Rual travel")
            .setDays(7)
            .setPrice(2000),
        new FutureTripEntity()
            .setName("Safari in South Africa")
            .setDestination("South Africa")
            .setCompany("Oasis travel agency")
            .setDays(10)
            .setPrice(3000)
    ));
  }
}
