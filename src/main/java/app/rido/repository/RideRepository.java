package app.rido.repository;

import app.rido.dto.RideDetailsDynamic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends CrudRepository<RideDetailsDynamic, Long> {
    RideDetailsDynamic findByRideId(String rideId);
}
