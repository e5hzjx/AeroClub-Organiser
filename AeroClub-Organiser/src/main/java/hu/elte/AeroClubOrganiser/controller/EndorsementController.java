package hu.elte.AeroClubOrganiser.controller;

import hu.elte.AeroClubOrganiser.model.Endorsement;
import hu.elte.AeroClubOrganiser.service.impl.EndorsementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endorsement")
public class EndorsementController {
    @Autowired
    private EndorsementServiceImpl endorsementService;

    @GetMapping("/findbyid")
    public ResponseEntity<Endorsement> findById(@RequestParam Long id){
        Endorsement endorsement = endorsementService.findById(id);
        return ResponseEntity.ok().body(endorsement);
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> saveEndorsement(@RequestParam Endorsement endorsement){
        endorsementService.save(endorsement);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deleteEndorsement(@RequestParam Endorsement endorsement){
        endorsementService.delete(endorsement);
        return ResponseEntity.ok().body(true);
    }
}
