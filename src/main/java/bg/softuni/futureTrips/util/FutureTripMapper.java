package bg.softuni.futureTrips.util;

import bg.softuni.futureTrips.data.AddFutureTripDto;
import bg.softuni.futureTrips.data.FutureTripEntity;
import bg.softuni.futureTrips.data.GetFutureTripDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FutureTripMapper {

  List<GetFutureTripDTO> map(List<FutureTripEntity> fortunes);

  @Mapping(target = "id", ignore = true)
  FutureTripEntity map(AddFutureTripDto addFutureTripDto);

  GetFutureTripDTO map(FutureTripEntity fortune);
}
