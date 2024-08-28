package com.application.rest.persistence.impl;

import com.application.rest.entities.Product;
import com.application.rest.persistence.IProductDAO;
import com.application.rest.repository.MakerRepository;
import com.application.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class ProductDAOImpl implements IProductDAO {

    @Autowired
    private ProductRepository productRepository; // este es el que hace las consultas a DB
    @Autowired
    private MakerRepository makerRepository;//Este tambien hace consultas a DB

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Long id, Product product) {

    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findProductByPrice(minPrice, maxPrice);
    }

}
