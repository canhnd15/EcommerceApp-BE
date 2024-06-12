package com.davidnguyen.ecommerce.repository;

import com.davidnguyen.ecommerce.enums.ERole;
import com.davidnguyen.ecommerce.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(ERole name);
}
