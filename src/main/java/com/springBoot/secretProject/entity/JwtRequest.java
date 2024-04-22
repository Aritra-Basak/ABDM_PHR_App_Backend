package com.springBoot.secretProject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class JwtRequest {
	@JsonProperty(value="userName")
    String email;
	@JsonProperty(value="userPassword")
    String password;
}
