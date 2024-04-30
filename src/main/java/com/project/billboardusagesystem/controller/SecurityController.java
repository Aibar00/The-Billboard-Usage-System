package com.project.billboardusagesystem.controller;

import com.project.billboardusagesystem.model.SignInRequest;
import com.project.billboardusagesystem.model.SignUpRequest;
import com.project.billboardusagesystem.model.UserEntity;
import com.project.billboardusagesystem.repository.UserRepository;
import com.project.billboardusagesystem.security.JWTCore;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class SecurityController {

    private UserRepository repository;
    private PasswordEncoder passwordEncoder;
    private AuthenticationManager authenticationManager;
    private JWTCore jwtCore;

    @PostMapping("/signup")
    ResponseEntity<?> signup(@RequestBody SignUpRequest signUpRequest){
        if (repository.existsByUsername(signUpRequest.getUsername())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("This username is already taken.");
        }
        if (repository.existsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("This email has already signed up.");
        }

        String hashed = passwordEncoder.encode(signUpRequest.getPassword());

        UserEntity user = new UserEntity();
        user.setName(signUpRequest.getName());
        user.setSurname(signUpRequest.getSurname());
        user.setUsername(signUpRequest.getUsername());
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(hashed);
        user.setContactInfo(signUpRequest.getContactInfo());
        user.setRole("USER");
        repository.save(user);
        return ResponseEntity.ok("Successfully saved");
    }
    @PostMapping("/signin")
    ResponseEntity<?> signin(@RequestBody SignInRequest signInRequest){
        Authentication authentication = null;
        try {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword()));
        } catch (BadCredentialsException e){
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtCore.generateToken(authentication);
        return ResponseEntity.ok(jwt);
    }
}
