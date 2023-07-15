package app.rido.controller;

import app.rido.dto.Ride;
import app.rido.dto.RideStatus;
import app.rido.service.RideService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/ride")
@RestController
@Slf4j
public class RideController {
    @Autowired
    private RideService rideService;
    @PostMapping("/create")
    public ResponseEntity<Ride> createRide(@RequestBody Ride ride) {
        log.info("ride = {}", ride);
        rideService.createRide(ride);
        ride.setStatus(RideStatus.UPCOMING);
        return new ResponseEntity<>(ride, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ride> getRide(@PathVariable (value = "id")
                                            String rideId) {
        Ride ride = rideService.getRide(rideId);
        return new ResponseEntity<Ride>(ride, HttpStatus.OK);
    }
//    @PostMapping("/rides/upcoming")
//    public ResponseEntity<List<Ride>> upcomingRides(@RequestBody RidesSearchRequest ridesSearchRequest) {
//        Ride ride = rideService.getRide(rideId);
//        return new ResponseEntity<Ride>(ride, HttpStatus.OK);
//    }
}
