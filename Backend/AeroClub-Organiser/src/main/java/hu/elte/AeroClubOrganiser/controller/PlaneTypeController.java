package hu.elte.AeroClubOrganiser.controller;

import hu.elte.AeroClubOrganiser.model.Endorsement;
import hu.elte.AeroClubOrganiser.model.Pilot;
import hu.elte.AeroClubOrganiser.model.PlaneType;
import hu.elte.AeroClubOrganiser.service.impl.PlaneTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plane/type")
@CrossOrigin(origins = "*",maxAge = 3600)
public class PlaneTypeController {
    @Autowired
    private PlaneTypeServiceImpl planeTypeService;

    @GetMapping("/findById")
    public ResponseEntity<PlaneType> findById(@RequestParam Long id){
        PlaneType planeType = planeTypeService.findById(id);
        return ResponseEntity.ok().body(planeType);
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> savePlaneType(@RequestBody PlaneType planeType){
        planeTypeService.save(planeType);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deletePlaneType(@RequestBody PlaneType planeType){
        planeTypeService.delete(planeType);
        return ResponseEntity.ok().body(true);
    }

}
