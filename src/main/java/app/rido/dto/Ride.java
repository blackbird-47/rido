package app.rido.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
@Data
public class Ride {
    @Id
    private String id;
    private String title;
    private String approxDistance;
    private String maxSlots;
    private String availableSlots;
    private String filledSlots;
    private Date rideStartTime;
    private Date rideEndTime;
    private String ownerId;
    private String startLocationId;
    private String endLocationId;
    private String rideImageURL;
}
