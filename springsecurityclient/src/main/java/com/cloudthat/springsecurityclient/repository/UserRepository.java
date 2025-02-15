package com.cloudthat.springsecurityclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloudthat.springsecurityclient.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
