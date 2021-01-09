package hu.elte.AeroClubOrganiser.controller;

import hu.elte.AeroClubOrganiser.model.Plane;
import hu.elte.AeroClubOrganiser.model.PlaneType;
import hu.elte.AeroClubOrganiser.service.impl.PlaneServiceImpl;
import hu.elte.AeroClubOrganiser.service.impl.PlaneTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/plane")
@CrossOrigin(origins = "*",maxAge = 3600)
public class PlaneController {

    @Autowired
    private PlaneServiceImpl planeService;

    @GetMapping("/findById")
    public ResponseEntity<Plane> findById(@RequestParam Long id){
        Plane plane = planeService.findById(id);
        return ResponseEntity.ok().body(plane);
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> savePlaneType(@RequestParam Plane plane){
        planeService.save(plane);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deletePlaneType(@RequestParam Plane plane){
        planeService.delete(plane);
        return ResponseEntity.ok().body(true);
    }

}



