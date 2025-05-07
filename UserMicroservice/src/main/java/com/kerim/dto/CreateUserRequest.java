package com.kerim.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserRequest {

    private Long authId;
    private String username;
    private String email;
}
