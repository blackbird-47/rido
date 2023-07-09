package app.rido.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
@Data
public class Ride {
    @Id
    private String id;
    private String title;
    private String distance;
    private String maxSlots;
    private String availableSlots;
    private Date startTime;
    private Date endTime;
    private String hostId;
    private String startLocationId;
    private String endLocationId;
    private String bannerUrl;
    private RideStatus status;
}
