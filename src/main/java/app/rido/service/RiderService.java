package app.rido.service;

import app.rido.dto.RideStatus;
import app.rido.dto.Rider;
import app.rido.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Service
public class RiderService {

    @Autowired
    private RiderRepository riderRepository;

    public void createRider(Rider rider){
        UUID uuid = UUID.randomUUID();
        rider.setId(uuid.toString());
        rider.setAccountCreationDate(new Date());
        rider.setLastLoginTime(new Date());
        riderRepository.save(rider);
    }
}
