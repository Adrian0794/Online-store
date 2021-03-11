package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name="product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    private String title;
    private String description;
    private String thumbnail;
    private String categoryEntity;
    private double price;
    private enum productType{
        NUMEDINFETRUPERSONALIZATE,
        NUMEDINFETRUSIMPLE,
        ANIMALUTECROSETATE,
        GHIOZDANALE,
    }
    private String producator;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(String categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }
}
