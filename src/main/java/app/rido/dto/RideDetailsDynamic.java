package app.rido.dto;

import lombok.Data;

import java.util.List;

@Data
public class RideDetailsDynamic {
    private Integer availableSlots;
    private Integer filledSlots;
    private List<Rider> ridersList;
}
