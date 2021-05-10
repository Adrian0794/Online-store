package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    private String title;
    private String description;
    @Column(length = 10000)
    private String thumbnail;
    private double price;

    private productType type;

    private enum productType {
        NUMEDINFETRUPERSONALIZATE,
        NUMEDINFETRUSIMPLE,
        ANIMALUTECROSETATE,
        GHIOZDANALE,
    }

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "producatorId")
    private ProducatorEntity producator;

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


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public ProducatorEntity getProducator() {
        return producator;
    }

    public void setProducator(ProducatorEntity producator) {
        this.producator = producator;
    }

}

