package hu.elte.AeroClubOrganiser.controller;

import hu.elte.AeroClubOrganiser.model.Endorsement;
import hu.elte.AeroClubOrganiser.service.impl.EndorsementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endorsement")
@CrossOrigin(origins = "*",maxAge = 3600)
public class EndorsementController {
    @Autowired
    private EndorsementServiceImpl endorsementService;

    @GetMapping("/findById")
    public ResponseEntity<Endorsement> findById(@RequestParam Long id){
        Endorsement endorsement = endorsementService.findById(id);
        return ResponseEntity.ok().body(endorsement);
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> saveEndorsement(@RequestBody Endorsement endorsement){
        endorsementService.save(endorsement);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deleteEndorsement(@RequestBody Endorsement endorsement){
        endorsementService.delete(endorsement);
        return ResponseEntity.ok().body(true);
    }
}
