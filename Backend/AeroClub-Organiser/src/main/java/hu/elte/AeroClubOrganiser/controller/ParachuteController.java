package hu.elte.AeroClubOrganiser.controller;

import hu.elte.AeroClubOrganiser.model.License;
import hu.elte.AeroClubOrganiser.model.Parachute;
import hu.elte.AeroClubOrganiser.service.impl.LicenseServiceImpl;
import hu.elte.AeroClubOrganiser.service.impl.ParachuteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parachute")
@CrossOrigin(origins = "*",maxAge = 3600)
public class ParachuteController {
    @Autowired
    private ParachuteServiceImpl parachuteService;

    @GetMapping("/listAll")
    public ResponseEntity<List<Parachute>> findById(){
        List<Parachute> parachutes = parachuteService.findAll();
        return ResponseEntity.ok().body(parachutes);
    }

    @GetMapping("/findById")
    public ResponseEntity<Parachute> findById(@RequestParam Long id){
        Parachute parachute = parachuteService.findById(id);
        return ResponseEntity.ok().body(parachute);
    }
    @PostMapping("/save")
    public ResponseEntity<Boolean> saveLicense(@RequestBody Parachute parachute){
        System.out.println(parachute);
        parachuteService.save(parachute);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deleteLicense(@RequestBody Parachute parachute){
        parachuteService.delete(parachute);
        return ResponseEntity.ok().body(true);
    }

}
