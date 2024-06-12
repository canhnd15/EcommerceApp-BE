package com.davidnguyen.ecommerce.service;

import com.davidnguyen.ecommerce.dtos.ApiResponseDto;
import com.davidnguyen.ecommerce.dtos.SignInRequestDto;
import com.davidnguyen.ecommerce.dtos.SignUpRequestDto;
import com.davidnguyen.ecommerce.exceptions.RoleNotFoundException;
import com.davidnguyen.ecommerce.exceptions.UserAlreadyExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    ResponseEntity<ApiResponseDto<?>> signUp(SignUpRequestDto signUpRequestDto) throws UserAlreadyExistsException, RoleNotFoundException;
    ResponseEntity<ApiResponseDto<?>> signIn(SignInRequestDto signInRequestDto);
}
