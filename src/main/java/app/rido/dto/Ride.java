package app.rido.dto;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
@Data
@Entity
public class Ride {
    @Id
    private String id;
    private String title;
    private int distance;
    private int maxSlots;
    private int availableSlots;
    private Date startTime;
    private Date endTime;
    private int durationInHours;
    private String hostId;
    private String source;
    private String destination;
    private String bannerURL;
    private RideStatus status;
}
