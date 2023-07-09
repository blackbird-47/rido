package app.rido.controller;

import app.rido.dto.Ride;
import app.rido.dto.Rider;
import app.rido.service.RideService;
import app.rido.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/rider")
public class Controller{

    @Autowired
    private RideService rideService;

    @Autowired
    private RiderService riderService;

    @PostMapping("/createRide")
    public ResponseEntity<String> createRide(@RequestBody Ride ride) {
        rideService.createRide(ride);
        return new ResponseEntity<String>(ride.getId(), HttpStatus.CREATED);
    }

    @PostMapping("/createRider")
    public ResponseEntity<String> createRide(@RequestBody Rider rider) {
        riderService.createRider(rider);
        return new ResponseEntity<>(rider.getId(), HttpStatus.CREATED);
    }

}
