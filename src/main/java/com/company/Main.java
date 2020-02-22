package com.company;

import com.company.service.ProductServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ProductService?wsdl",
                new ProductServiceImpl());
    }
}
