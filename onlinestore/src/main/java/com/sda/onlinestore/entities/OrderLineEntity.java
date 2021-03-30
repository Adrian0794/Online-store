package com.sda.onlinestore.entities;

import com.fasterxml.jackson.annotation.JacksonInject;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="orderLine")
public class OrderLineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderLineId;
    private double quantityOfProducts;
    private double productPrice;
    private double totalPriceOrder;

    @ManyToOne
    private ProductEntity product;

    public Integer getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(Integer orderLineId) {
        this.orderLineId = orderLineId;
    }

    public double getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(double quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public double getTotalPriceOrder() {
        return totalPriceOrder;
    }

    public void setTotalPriceOrder(double totalPriceOrder) {
        this.totalPriceOrder = totalPriceOrder;
    }
}
