package bg.softuni.futureTrips.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FutureTripRepository extends JpaRepository<FutureTripEntity, Long> {

}
