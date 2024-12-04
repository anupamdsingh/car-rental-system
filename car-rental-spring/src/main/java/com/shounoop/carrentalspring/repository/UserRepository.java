package com.shounoop.carrentalspring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shounoop.carrentalspring.entity.User;
import com.shounoop.carrentalspring.enums.UserRole;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);

    List<User> findByUserRole(@Param("role") UserRole userRole);

}
