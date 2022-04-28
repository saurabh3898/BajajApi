package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
