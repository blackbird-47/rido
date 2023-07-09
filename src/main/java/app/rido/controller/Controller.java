package app.rido.controller;


import app.rido.dto.RideDetails;
import app.rido.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/rider")
public class Controller{

    @Autowired
    private RideService rideService;

    @PostMapping("/createRide")
    public ResponseEntity<String> createRide(@RequestBody RideDetails rideDetails) {
        rideService.createRide(rideDetails);
        return new ResponseEntity<>(null);
    }

//    @PostMapping("/createRider")
//    public ResponseEntity<String> createRider(@RequestBody Rider rider) {

//    }

}
