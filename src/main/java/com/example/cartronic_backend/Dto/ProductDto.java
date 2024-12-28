package com.example.cartronic_backend.Dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {

    private Long id;
    private String name;
    private String category;
    private BigDecimal price;
    private boolean disponibility;
    private String description;
    private String image;
}
