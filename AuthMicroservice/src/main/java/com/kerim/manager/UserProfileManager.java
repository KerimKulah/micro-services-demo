package com.kerim.manager;

import com.kerim.dto.CreateUserRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.kerim.config.RestApis.CREATE_USER;


@FeignClient(url = "http://localhost:9091/dev/v1/userprofile/", name = "user-profile-manager")
public interface UserProfileManager {

    @PostMapping(CREATE_USER)
    ResponseEntity<Boolean> createUserProfile(@RequestBody CreateUserRequest request);
}
