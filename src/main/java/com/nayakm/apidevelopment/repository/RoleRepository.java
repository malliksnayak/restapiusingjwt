package com.nayakm.apidevelopment.repository;

import com.nayakm.apidevelopment.entity.ERole;
import com.nayakm.apidevelopment.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
