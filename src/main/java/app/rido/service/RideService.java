package app.rido.service;


import app.rido.dto.RideDetails;
import app.rido.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RideService {

    @Autowired
    private RideRepository rideRepository;
    public void createRide(RideDetails rideDetails){
        UUID uuid = UUID.randomUUID();
        rideDetails.setId(uuid.toString());
//        rideRepository.save(rideDetails);

    }

}
