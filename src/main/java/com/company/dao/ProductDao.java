package com.company.dao;

import com.company.dto.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDao {

    private List<Product> products = Arrays.asList(
            new Product(1, "Çikolata", "safsafd", 1.0, 1),
            new Product(2, "Pirinç", "safsafd", 6.0, 2),
            new Product(3, "Salça", "safsafd", 12.0, 2),
            new Product(4, "Domestos", "safsafd", 7.25, 3)
    );

    public ProductDao() {
    }

    public void insert(Product product) {
        System.out.println(product);
        this.products.add(product);
    }

    public void update(Product product) {
        this.products.forEach(p -> {
            if (p.getId().equals(product.getId())) {
                p = product;
            }
        });
    }

    public void delete(Integer productId) {
        this.products.forEach(p -> {
            if (p.getId().equals(productId)) this.products.remove(p);
        });
    }

    public Product getById(Integer id) {
        return this.products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public List<Product> getByCategory(Integer categoryId) {
        return this.products.stream().filter(product -> product.getCategoryId().equals(categoryId)).collect(Collectors.toList());
    }
}