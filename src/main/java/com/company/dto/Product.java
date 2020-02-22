package com.company.dto;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "product")
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "categoryId", "name", "description", "price"})
public class Product {

    @XmlElement(name = "productId", required = true)
    private Integer id;

    @XmlElement(name = "productName", required = true)
    private String name;

    @XmlElement(name = "productDescription", required = true)
    private String description;

    @XmlElement(name = "productPrice", required = true)
    private Double price;

    @XmlElement(name = "productCategoryId", required = true)
    private Integer categoryId;

    public Product() {

    }

    public Product(Integer id, String name, String description, Double price, Integer categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
    }

    public Product(Product product) {
        this.id = product.id;
        this.categoryId = product.categoryId;
        this.name = product.name;
        this.description = product.description;
        this.price = product.price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", categoryId=" + categoryId +
                '}';
    }
}
