package hu.elte.AeroClubOrganiser.controller;

import hu.elte.AeroClubOrganiser.model.PlaneType;
import hu.elte.AeroClubOrganiser.model.Transporter;
import hu.elte.AeroClubOrganiser.service.TransporterService;
import hu.elte.AeroClubOrganiser.service.impl.PlaneTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transporter")
@CrossOrigin(origins = "*",maxAge = 3600)
public class TransporterController {
    @Autowired
    private TransporterService transporterService;

    @GetMapping("/findById")
    public ResponseEntity<Transporter> findById(@RequestParam Long id){
        Transporter planeType = transporterService.findById(id);
        return ResponseEntity.ok().body(planeType);
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> savePlaneType(@RequestBody Transporter planeType){
        transporterService.save(planeType);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deletePlaneType(@RequestBody Transporter planeType){
        transporterService.delete(planeType);
        return ResponseEntity.ok().body(true);
    }

}
