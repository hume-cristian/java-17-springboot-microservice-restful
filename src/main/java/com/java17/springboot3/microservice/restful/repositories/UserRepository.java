package com.java17.springboot3.microservice.restful.repositories;

import com.java17.springboot3.microservice.restful.models.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hume Cristian
 * @version 1.0.0
 * @since 2024-11-25
 */
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
