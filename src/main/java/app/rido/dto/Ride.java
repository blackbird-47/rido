package app.rido.dto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
public class Ride {
    @Id
    private UUID id;
    @Column(name = "title")
    private String title;
    @Column(name = "distance")
    private int distance;
    @Column(name = "maxslots")
    private int maxSlots;
    @Column(name="availableslots")
    private int availableSlots;
    @Column(name="starttime")
    private Date startTime;
    @Column(name="endtime")
    private Date endTime;
    @Column(name="durationinhours")
    private int durationInHours;
    @Column(name="hostid")
    private UUID hostId;
    @Column(name = "source")
    private String source;
    @Column(name = "destination")
    private String destination;
    @Column(name="bannerurl")
    private String bannerURL;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private RideStatus status;
}
