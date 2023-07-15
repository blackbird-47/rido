package app.rido.controller;

import app.rido.dto.Ride;
import app.rido.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/ride")
public class RideController {

    @Autowired
    private RideService rideService;

    @PostMapping("/create")
    public ResponseEntity<Ride> createRide(@RequestBody Ride ride) {
        rideService.createRide(ride);
        return new ResponseEntity<>(ride, HttpStatus.CREATED);
    }

    @GetMapping("/{rideId}}")
    public ResponseEntity<Ride> getRide(String rideId) {
        Ride ride = rideService.getRide(rideId);
        return new ResponseEntity<Ride>(ride, HttpStatus.OK);
    }

//    @PostMapping("/rides/upcoming")
//    public ResponseEntity<List<Ride>> upcomingRides(@RequestBody RidesSearchRequest ridesSearchRequest) {
//        Ride ride = rideService.getRide(rideId);
//        return new ResponseEntity<Ride>(ride, HttpStatus.OK);
//    }
}
