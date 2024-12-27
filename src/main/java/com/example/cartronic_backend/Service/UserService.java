package com.example.cartronic_backend.Service;

import com.example.cartronic_backend.Dto.UserDto;
import com.example.cartronic_backend.Dto.UserLoginDto;

import java.util.List;

public interface UserService {
    UserDto addUser(UserDto user);
    UserDto updateUser(UserDto user);
    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
    void deleteUserById(Long id);

    //Nuevo método para login
    String authenticate(UserLoginDto userLoginDto); //Retorna el token JWT si es válido
}
