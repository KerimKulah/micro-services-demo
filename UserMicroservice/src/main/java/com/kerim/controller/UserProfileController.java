package com.kerim.controller;

import com.kerim.document.UserProfile;
import com.kerim.dto.CreateUserRequest;
import com.kerim.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static com.kerim.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(USERPROFILE)
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping(CREATE_USER)
    public ResponseEntity <Boolean> createUserProfile(@RequestBody CreateUserRequest request) {
        userProfileService.createUserProfile(request);
        return ResponseEntity.ok(true);
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<UserProfile>> getAll()
    {
        return ResponseEntity.ok(userProfileService.getAll());
    }

    @GetMapping(UPPER_NAME)
    public ResponseEntity<String> upperName(@RequestParam String name) {
        return ResponseEntity.ok(userProfileService.upperName(name));
    }

}
