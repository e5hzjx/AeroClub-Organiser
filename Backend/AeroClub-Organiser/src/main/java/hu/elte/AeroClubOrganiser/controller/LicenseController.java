package hu.elte.AeroClubOrganiser.controller;

import hu.elte.AeroClubOrganiser.model.License;
import hu.elte.AeroClubOrganiser.model.PlaneType;
import hu.elte.AeroClubOrganiser.service.impl.LicenseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/license")
@CrossOrigin(origins = "*",maxAge = 3600)
public class LicenseController {
    @Autowired
    private LicenseServiceImpl licenseService;

    @GetMapping("/findById")
    public ResponseEntity<License> findById(@RequestParam Long id){
        License license = licenseService.findById(id);
        return ResponseEntity.ok().body(license);
    }
    @PostMapping("/save")
    public ResponseEntity<Boolean> saveLicense(@RequestBody License license){
        licenseService.save(license);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deleteLicense(@RequestBody License license){
        licenseService.delete(license);
        return ResponseEntity.ok().body(true);
    }

}
