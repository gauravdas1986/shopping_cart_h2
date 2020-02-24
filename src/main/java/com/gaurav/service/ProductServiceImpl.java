package com.gaurav.service;

import com.gaurav.model.Product;
import com.gaurav.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) throws Exception {
        return productRepository
          .findById(id)
          .orElseThrow(() -> new Exception("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}