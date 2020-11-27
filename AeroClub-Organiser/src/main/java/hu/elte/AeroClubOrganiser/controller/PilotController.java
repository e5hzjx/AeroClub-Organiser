package hu.elte.AeroClubOrganiser.controller;


import hu.elte.AeroClubOrganiser.service.impl.PilotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PilotController {
    @Autowired
    private PilotServiceImpl pilotService;

    @GetMapping("/test")
    public ResponseEntity<Boolean> test(){
        return ResponseEntity.ok().body(true);
    }
}
