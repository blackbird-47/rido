package app.rido.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class RiderOnRide {

    @Column(name="rideid")
    private String rideId;
    @Column(name="riderid")
    private String riderId;
    @Column(name="noshow")
    private boolean noShow;
    @Column(name="riderintent")
    private RiderIntent riderIntent;
    @Column(name="lastmodifieddate")
    private Date lastModifiedDate;
}
