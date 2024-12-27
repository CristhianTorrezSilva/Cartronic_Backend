package com.example.cartronic_backend.Service.Impl;

import com.example.cartronic_backend.Dto.ProductDto;
import com.example.cartronic_backend.Entity.Product;
import com.example.cartronic_backend.Repository.ProductRepository;
import com.example.cartronic_backend.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductDto addProduct(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setCategory(productDto.getCategory());
        product.setPrice(productDto.getPrice());
        product.setDisponibility(productDto.isDisponibility());
        productRepository.save(product);
        return productDto;
    }

    @Override
    public ProductDto updateProduct(ProductDto productDto) {
        // Implementación de ejemplo
        return null;
    }

    @Override
    public ProductDto getProductById(Long id) {
        // Implementación de ejemplo
        return null;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> new ProductDto(
                        product.getId(),
                        product.getName(),
                        product.getCategory(),
                        product.getPrice(),
                        product.isDisponibility(),
                        product.getDescription(),
                        product.getImage()))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getProductsByCategory(String category) {
        return productRepository.findByCategory(category).stream()
                .map(product -> new ProductDto(
                        product.getId(),
                        product.getName(),
                        product.getCategory(),
                        product.getPrice(),
                        product.isDisponibility(),
                        product.getDescription(),
                        product.getImage()))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getAvailableProducts() {
        return productRepository.findByDisponibilityTrue().stream()
                .map(product -> new ProductDto(
                        product.getId(),
                        product.getName(),
                        product.getCategory(),
                        product.getPrice(),
                        product.isDisponibility(),
                        product.getDescription(),
                        product.getImage()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
