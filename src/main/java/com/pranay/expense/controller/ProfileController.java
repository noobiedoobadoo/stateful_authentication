package com.pranay.expense.controller;


import com.pranay.expense.dto.ProfileDto;
import com.pranay.expense.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/register")
    public ResponseEntity<ProfileDto> registerProfile(@RequestBody ProfileDto profileDto) {
        ProfileDto registerProfile = profileService.registerProfile(profileDto);
        return new ResponseEntity<>(registerProfile, HttpStatus.CREATED);
    }
}
