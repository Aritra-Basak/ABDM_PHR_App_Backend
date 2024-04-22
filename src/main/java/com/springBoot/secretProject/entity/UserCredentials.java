package com.springBoot.secretProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@ToString
@Entity
@Table(name="JWT_User_Details")
public class UserCredentials {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    @JsonProperty(value="ID")
    int userId;

    @Column(name="user_name")
    @JsonProperty(value="Name")
    String name;

    @Column(name="user_email_id")
    @JsonProperty(value="E-mail")
    String email;

    @Column(name="user_password")
    @JsonProperty(value="Password")
    String password;

    @Column(name="user_role")
    @JsonProperty(value="Role")
    String role;

    @JsonIgnore
    @Column(name="is_active")
    int isActive;

    @JsonProperty(value="User_is_Active")
    String isActiveValue;

}
