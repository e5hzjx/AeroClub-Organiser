package hu.elte.AeroClubOrganiser.controller;


import hu.elte.AeroClubOrganiser.model.Pilot;
import hu.elte.AeroClubOrganiser.service.PilotService;
import hu.elte.AeroClubOrganiser.service.impl.PilotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pilot")
public class PilotController {
    @Autowired
    private PilotServiceImpl pilotService;

    @GetMapping("/findbyid")
    public ResponseEntity<Pilot> findById(@RequestParam Long id){
        Pilot pilot = pilotService.findById(id);
        return ResponseEntity.ok().body(pilot);
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> savePilot(@RequestParam Pilot pilot){
        pilotService.save(pilot);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deletePilot(@RequestParam Pilot pilot){
        pilotService.delete(pilot);
        return ResponseEntity.ok().body(true);
    }
}
