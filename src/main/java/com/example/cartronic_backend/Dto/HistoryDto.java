package com.example.cartronic_backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoryDto {

    private Long id;
    private String action;
    private LocalDate date;
    private String username; // Nombre del usuario que realizó la acción
    private String productName; // Nombre del producto afectado
}
