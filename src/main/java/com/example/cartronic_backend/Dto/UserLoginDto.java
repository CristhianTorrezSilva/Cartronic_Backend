package com.example.cartronic_backend.Dto;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDto {

    private String username;
    private String password;

}
