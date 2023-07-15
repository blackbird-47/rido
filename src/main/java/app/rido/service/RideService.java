package app.rido.service;


import app.rido.dto.Ride;
import app.rido.dto.RideStatus;
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
        ride.setStatus(RideStatus.UPCOMING);
        rideRepository.save(ride);
    }

    public Ride getRide(String rideId){
        return rideRepository.getById(rideId);
    }

    public Ride getRides(String rideId){
        return rideRepository.getById(rideId);
    }
}
