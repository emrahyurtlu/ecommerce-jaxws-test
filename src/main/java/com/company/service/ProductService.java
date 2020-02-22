package com.company.service;

import com.company.dto.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import java.util.List;

@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ProductService {

    @WebMethod
    @GET
    Product getById(Integer productId);

    @WebMethod
    @GET
    List<Product> getProducts();

    @WebMethod
    @GET
    List<Product> getByCategory(Integer categoryId);

    @WebMethod
    @POST
    void insert(Product product);

    @WebMethod
    @PUT
    void update(Product product);

    @WebMethod
    @DELETE
    void delete(Integer productId);
}
