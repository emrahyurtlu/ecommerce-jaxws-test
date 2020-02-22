package com.company.dao;

import com.company.dto.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDao {

    private List<Product> products;

    public ProductDao() {
        this.products = new ArrayList<>();
        this.products.add(new Product(1, "Çikolata", "safsafd", 1.0, 1));
        this.products.add(new Product(2, "Pirinç", "safsafd", 6.0, 2));
        this.products.add(new Product(3, "Salça", "safsafd", 12.0, 2));
        this.products.add(new Product(4, "Domestos", "safsafd", 7.25, 3));
    }

    public void insert(Product product) {
        System.out.println("Will be inserted: " + product);
        this.products.add(new Product(product));
    }

    public void update(Product product) {
        System.out.println("Will be updated: " + product);
        for (int i = 0; i < this.products.size(); i++) {
            Product temp = this.products.get(i);
            if (temp.getId().equals(product.getId())) {
                this.products.set(i, product);
            }
        }
    }

    public void delete(Integer productId) {
        System.out.println("Will be deleted: " + productId);
        for (int i = 0; i < this.products.size(); i++) {
            Product temp = this.products.get(i);
            if (temp.getId().equals(productId)) {
                this.products.remove(i);
                break;
            }
        }
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