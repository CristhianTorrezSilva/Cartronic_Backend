package com.example.cartronic_backend.Mapper;

import com.example.cartronic_backend.Dto.ProductDto;
import com.example.cartronic_backend.Entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    // Convertir de Product a ProductDTO
    public static ProductDto ProductToProductDTO(Product product) {
        if (product == null) return null;

        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setCategory(product.getCategory());
        dto.setPrice(product.getPrice());
        dto.setDisponibility(product.isDisponibility());
        dto.setDescription(product.getDescription());
        dto.setImage(product.getImage());

        return dto;
    }

    // Convertir de ProductDTO a Product
    public static Product ProductDTOToProduct(ProductDto productDto) {
        if (productDto == null) return null;

        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setCategory(productDto.getCategory());
        product.setPrice(productDto.getPrice());
        product.setDisponibility(productDto.isDisponibility());
        product.setDescription(productDto.getDescription());
        product.setImage(productDto.getImage());

        return product;
    }

    // Convertir lista de Products a lista de ProductDTOs
    public static List<ProductDto> ProductToProductDTOList(List<Product> products) {
        if (products == null) return null;

        return products.stream()
                .map(ProductMapper::ProductToProductDTO)
                .collect(Collectors.toList());
    }
}