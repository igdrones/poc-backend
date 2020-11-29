package com.it.ig.tech.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.ig.tech.poc.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
