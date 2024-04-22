package com.springBoot.secretProject.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class JwtResponse {
    String jwtToken;
    String username;
    Date expiryDate;
}
