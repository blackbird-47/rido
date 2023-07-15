package app.rido.controller;
import app.rido.dto.Rider;
import app.rido.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/v1/rider")
@RestController
public class RiderController {
    @Autowired
    private RiderService riderService;

    @PostMapping("/create")
    public ResponseEntity<UUID> createRider(@RequestBody Rider rider) {
        riderService.createRider(rider);
        return new ResponseEntity<>(rider.getId(), HttpStatus.CREATED);
    }

    @GetMapping("/{riderId}")
    public ResponseEntity<Rider> getRider(String  riderId) {
        Rider rider = riderService.getRider(riderId);
        return new ResponseEntity<>(rider, HttpStatus.OK);
    }
}
