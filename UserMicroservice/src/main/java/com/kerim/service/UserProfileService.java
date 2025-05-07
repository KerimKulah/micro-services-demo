package com.kerim.service;

import com.kerim.document.UserProfile;
import com.kerim.dto.CreateUserRequest;
import com.kerim.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private  final UserRepository userRepository;

    public void createUserProfile(CreateUserRequest request) {
        userRepository.save(UserProfile.builder()
                .authId(request.getAuthId())
                .username(request.getUsername())
                .email(request.getEmail())
                .build());
    }

    public List<UserProfile> getAll() {
        return userRepository.findAll();
    }

    //Redis deneme amaçlı method
    @Cacheable("upperName")
    public String upperName(String name) {
        return name.toUpperCase();
    }
}
