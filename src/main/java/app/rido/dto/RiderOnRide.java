package app.rido.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RiderOnRide {
    private String rideId;
    private String riderId;
    private boolean noShow;
    private RiderIntent riderIntent;
    private Date lastModifiedDate;
}
