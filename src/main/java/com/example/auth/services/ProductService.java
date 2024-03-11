package com.example.auth.services;

import com.example.auth.domain.product.Product;
import com.example.auth.domain.product.ProductRequestDTO;
import com.example.auth.domain.product.ProductResponseDTO;
import com.example.auth.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<ProductResponseDTO> getAllProducts(){
        return repository.findAll().stream().map(ProductResponseDTO::new).toList();
    }

    public void createProduct(ProductRequestDTO data){
        Product newProduct = new Product(data);
        repository.save(newProduct);
    }
}
