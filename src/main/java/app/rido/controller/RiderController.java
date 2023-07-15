package app.rido.controller;
import app.rido.dto.Rider;
import app.rido.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/rider")
@RestController
public class RiderController {
    @Autowired
    private RiderService riderService;

    @PostMapping("/create")
    public ResponseEntity<Rider> createRider(@RequestBody Rider rider) {
        riderService.createRider(rider);
        return new ResponseEntity<>(rider, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rider> getRider(@PathVariable(value = "id") String riderId) {
        Rider rider = riderService.getRider(riderId);
        return new ResponseEntity<>(rider, HttpStatus.OK);
    }
}
