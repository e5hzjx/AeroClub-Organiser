package hu.elte.AeroClubOrganiser.controller;


import hu.elte.AeroClubOrganiser.model.Pilot;
import hu.elte.AeroClubOrganiser.service.PilotService;
import hu.elte.AeroClubOrganiser.service.impl.PilotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pilot")
@CrossOrigin(origins = "*",maxAge = 3600)
public class PilotController {
    @Autowired
    private PilotServiceImpl pilotService;

    @GetMapping("/findById")
    public ResponseEntity<Pilot> findById(@RequestParam Long id){
        Pilot pilot = pilotService.findById(id);
        return ResponseEntity.ok().body(pilot);
    }

    @GetMapping("/findByName")
    public ResponseEntity<Pilot> findByPilotName(@RequestParam String pilotName){
        Pilot pilot = pilotService.findByPilotName(pilotName);
        return ResponseEntity.ok().body(pilot);
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> savePilot(@RequestBody Pilot pilot){
        pilotService.save(pilot);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deletePilot(@RequestBody Pilot pilot){
        pilotService.delete(pilot);
        return ResponseEntity.ok().body(true);
    }
}
