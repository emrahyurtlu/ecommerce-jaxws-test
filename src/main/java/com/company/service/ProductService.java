package com.company.service;

import com.company.dto.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ProductService {

    @WebMethod
    Product getById(Integer productId);

    @WebMethod
    List<Product> getProducts();

    @WebMethod
    List<Product> getByCategory(Integer categoryId);

    @WebMethod
    void insert(Product product);

    @WebMethod
    void update(Product product);

    @WebMethod
    void delete(Integer productId);
}
