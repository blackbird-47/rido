package app.rido.service;
import app.rido.dto.Rider;
import app.rido.repository.RiderRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class RiderService {
    private SimpleDateFormat simpleDateFormat;
    @PostConstruct
    public void init(){
        String DATE_PATTERN = "dd-mm-yyyy HH:mm:ss";
        simpleDateFormat= new SimpleDateFormat(DATE_PATTERN);
    }

    @Autowired
    private RiderRepository riderRepository;

    public void createRider(Rider rider){
        UUID uuid = UUID.randomUUID();
        rider.setId(uuid);
        String date = simpleDateFormat.format(new Date());
//        simpleDateFormat.
//        System.out.println(date);
        rider.setAccountcreationdate(new Timestamp(new Date().getTime()));
        rider.setLastlogin(new Date());
        riderRepository.save(rider);
    }

    public Rider getRider(String riderId){
       return riderRepository.getById(riderId);
    }



}
