package com.davidnguyen.ecommerce.service;

import com.davidnguyen.ecommerce.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    boolean existByUsername(String username);
    boolean existByEmail(String email);
    void save(User user);
}
