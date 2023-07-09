package app.rido.service;


import app.rido.dto.Ride;
import app.rido.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RideService {

    @Autowired
    private RideRepository rideRepository;
    public void createRide(Ride ride){
        UUID uuid = UUID.randomUUID();
        ride.setId(uuid.toString());
        rideRepository.save(ride);
//        ri.save(rideDetails);

    }
}
