package com.company.service;

import com.company.dao.ProductDao;
import com.company.dto.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "ProductService", portName = "ProductServicePort")
public class ProductServiceImpl implements ProductService {
    private ProductDao productDao = new ProductDao();

    //@WebMethod
    public Product getById(Integer productId) {
        System.out.println("Sorgulanan kayıt: " + productId);
        return productDao.getById(productId);
    }

    //@WebMethod
    public List<Product> getProducts() {
        return productDao.getProducts();
    }

    //@WebMethod
    public List<Product> getByCategory(Integer categoryId) {
        return productDao.getByCategory(categoryId);
    }

    //@WebMethod
    public void insert(Product product) {
        System.out.println(product);
        productDao.insert(product);
    }

    //@WebMethod
    public void update(Product product) {
        productDao.update(product);
    }

    //@WebMethod
    public void delete(Integer productId) {
        productDao.delete(productId);
    }
}