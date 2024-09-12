package com.api.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.app.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
