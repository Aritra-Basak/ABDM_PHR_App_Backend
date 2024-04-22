package com.springBoot.secretProject.repository;

import com.springBoot.secretProject.entity.UserCredentials;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserCredentials,Integer> {
}
