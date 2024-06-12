package com.davidnguyen.ecommerce.factory;

import com.davidnguyen.ecommerce.enums.ERole;
import com.davidnguyen.ecommerce.entity.Role;
import com.davidnguyen.ecommerce.exceptions.RoleNotFoundException;
import com.davidnguyen.ecommerce.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleFactory {
    @Autowired
    RoleRepository roleRepository;

    public Role getInstance(String role) throws RoleNotFoundException {
        switch (role) {
            case "admin" -> {
                return roleRepository.findByName(ERole.ROLE_ADMIN);
            }
            case "user" -> {
                return roleRepository.findByName(ERole.ROLE_USER);
            }
            case "super_admin" -> {
                return roleRepository.findByName(ERole.ROLE_SUPER_ADMIN);
            }
            default -> throw  new RoleNotFoundException("No role found for " +  role);
        }
    }
}
