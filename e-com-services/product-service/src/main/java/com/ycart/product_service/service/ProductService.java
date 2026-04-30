package com.ycart.product_service.service;

import com.ycart.product_service.dto.ProductRequestDTO;
import com.ycart.product_service.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService  {

    ProductResponseDTO createProduct(ProductRequestDTO request);

    List<ProductResponseDTO> getAllProducts();

    ProductResponseDTO getProductById(Long id);

    ProductResponseDTO updateProduct(Long id, ProductRequestDTO request);

    void deleteProduct(Long id);

    List<ProductResponseDTO> getByCategory(String category);
}