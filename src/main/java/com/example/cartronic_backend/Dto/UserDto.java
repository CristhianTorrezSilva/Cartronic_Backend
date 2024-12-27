package com.example.cartronic_backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String password; // Esto se usará solo internamente, no debe ser expuesto

    // Constructor para casos donde no se necesita el password (por ejemplo, respuestas al frontend)
    public UserDto(Long id, String username) {
        this.id = id;
        this.username = username;
    }
}
