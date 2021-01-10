package hu.elte.AeroClubOrganiser.controller;


import javax.validation.Valid;

import hu.elte.AeroClubOrganiser.model.Pilot;
import hu.elte.AeroClubOrganiser.security.jwt.JwtUtils;
import hu.elte.AeroClubOrganiser.security.payload.request.LoginRequest;
import hu.elte.AeroClubOrganiser.security.payload.request.SignupRequest;
import hu.elte.AeroClubOrganiser.security.payload.response.JwtResponse;
import hu.elte.AeroClubOrganiser.security.payload.response.MessageResponse;
import hu.elte.AeroClubOrganiser.security.service.PilotDetailsImpl;
import hu.elte.AeroClubOrganiser.service.PilotService;
import hu.elte.AeroClubOrganiser.service.impl.PilotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    PilotServiceImpl pilotService;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);
        PilotDetailsImpl userDetails = (PilotDetailsImpl) authentication.getPrincipal();
        return ResponseEntity.ok(new JwtResponse(jwt,
                userDetails.getId(),
                userDetails.getUsername(),
                userDetails.getEmail()
        ));
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        if (pilotService.existsByPilotName(signUpRequest.getUsername())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken!"));
        }

        if (pilotService.existsByPilotEmail(signUpRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }

        // Create new user's account
        Pilot pilot = new Pilot(signUpRequest.getUsername(),
                signUpRequest.getEmail(),
                encoder.encode(signUpRequest.getPassword()));

        pilotService.save(pilot);
        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}
