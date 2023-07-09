package app.rido.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
@Data
public class RideDetails {
    @Id
    private String id;
    private String title;
    private String approxDistance;
    private String maxRiders;
    private Date rideStartTime;
    private Date rideEndTime;
    private String ownerId;
    private String startLocationId;
    private String endLocationId;
    private String rideImageURL;
}
