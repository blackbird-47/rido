package app.rido.repository;

import app.rido.dto.RiderOnRide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends CrudRepository<RiderOnRide, Long> {
    RiderOnRide findByRideId(String rideId);
}
