package com.ycart.product_service.controller;
import com.ycart.product_service.dto.ProductRequestDTO;
import com.ycart.product_service.dto.ProductResponseDTO;
import com.ycart.product_service.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ProductResponseDTO create(@Valid @RequestBody ProductRequestDTO request) {
        return service.createProduct(request);
    }

    @GetMapping
    public List<ProductResponseDTO> getAll() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductResponseDTO getById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @PutMapping("/{id}")
    public ProductResponseDTO update(
            @PathVariable Long id,
            @Valid @RequestBody ProductRequestDTO request) {
        return service.updateProduct(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteProduct(id);
    }

    @GetMapping("/search")
    public List<ProductResponseDTO> search( @RequestParam String category) {
        return service.getByCategory(category);
    }
}