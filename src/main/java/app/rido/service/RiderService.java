package app.rido.service;
import app.rido.dto.Rider;
import app.rido.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class RiderService {

    @Autowired
    private RiderRepository riderRepository;

    public void createRider(Rider rider){
        UUID uuid = UUID.randomUUID();
        rider.setId(uuid);
        rider.setAccountcreationdate(new Date());
        rider.setLastlogin(new Date());
        riderRepository.save(rider);
    }

    public Rider getRider(String riderId){
       return riderRepository.getById(riderId);
    }



}
