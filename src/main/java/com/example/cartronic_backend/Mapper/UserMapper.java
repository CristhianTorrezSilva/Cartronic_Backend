package com.example.cartronic_backend.Mapper;

import com.example.cartronic_backend.Dto.UserDto;
import com.example.cartronic_backend.Entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    // Convertir de User a UserDTO
    public static UserDto UserToUserDTO(User user) {
        if (user == null) return null;

        return new UserDto(
                user.getId(),
                user.getUsername(),
                user.getPassword()
        );
    }

    // Convertir de UserDTO a User
    public static User UserDTOToUser(UserDto userDto) {
        if (userDto == null) return null;

        // Usar el constructor que ya existe en la clase User
        return new User(
                userDto.getUsername(),
                userDto.getPassword()
        );
    }

    // Convertir lista de Users a lista de UserDTOs
    public static List<UserDto> UserToUserDTOList(List<User> users) {
        if (users == null) return null;

        return users.stream()
                .map(UserMapper::UserToUserDTO)
                .collect(Collectors.toList());
    }
}