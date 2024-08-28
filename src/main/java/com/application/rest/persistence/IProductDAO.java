package com.application.rest.persistence;

import com.application.rest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductDAO {

    List<Product> findAll();

    Optional <Product> findById(int id);

    Optional<Product> findById(Long id);

    void save(Product product);

    void update(Long id, Product product);

    void delete(Long id);

    //Obtener productos por rando
    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
}
