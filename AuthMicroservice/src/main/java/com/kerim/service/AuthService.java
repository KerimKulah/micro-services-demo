package com.kerim.service;


import com.kerim.dto.CreateUserRequest;
import com.kerim.dto.LoginResponse;
import com.kerim.dto.RegisterRequest;
import com.kerim.entity.Auth;
import com.kerim.manager.UserProfileManager;
import com.kerim.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthRepository authRepository;
    private final UserProfileManager userProfileManager;

    public String register(RegisterRequest request) {
        Auth auth  = authRepository.save(
                Auth.builder()
                        .username(request.getUsername())
                        .password(request.getPassword())
                        .email(request.getEmail())
                        .build());
        // FeignClient çağrısı
        userProfileManager.createUserProfile(CreateUserRequest.builder()
                        .authId(auth.getId())
                        .username(auth.getUsername())
                        .email(auth.getEmail())
                .build());
        return "User registered successfully";
    }


    public Boolean login(LoginResponse response) {
        return authRepository.existsByUsernameAndPassword(response.getUsername(), response.getPassword());
    }
}
