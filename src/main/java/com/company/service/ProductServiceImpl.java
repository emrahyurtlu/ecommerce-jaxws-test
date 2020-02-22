package com.company.service;

import com.company.dao.ProductDao;
import com.company.dto.Product;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "ProductService", portName = "ProductServicePort")
public class ProductServiceImpl implements ProductService {
    private ProductDao productDao = new ProductDao();
    
    public Product getById(Integer productId) {
        System.out.println("Sorgulanan kayıt: " + productId);
        return productDao.getById(productId);
    }

    public List<Product> getProducts() {
        return productDao.getProducts();
    }

    public List<Product> getByCategory(Integer categoryId) {
        return productDao.getByCategory(categoryId);
    }

    public void insert(Product product) {
        productDao.insert(product);
    }

    public void update(Product product) {
        productDao.update(product);
    }

    public void delete(Integer productId) {
        productDao.delete(productId);
    }
}