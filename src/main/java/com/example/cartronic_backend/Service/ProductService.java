package com.example.cartronic_backend.Service;

import com.example.cartronic_backend.Dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto addProduct(ProductDto product);
    ProductDto updateProduct(ProductDto product);
    ProductDto getProductById(Long id);
    List<ProductDto> getAllProducts();
    List<ProductDto> getProductsByCategory(String category);
    List<ProductDto>getAvailableProducts();
    void deleteProduct(Long id);
}
