package com.sda.onlinestore.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    private String categoryImage;

    @OneToMany(mappedBy = "category")
    private List<ProductEntity> product;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<ProductEntity> getProduct() {
        return product;
    }

    public void setProduct(List<ProductEntity> product) {
        this.product = product;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }
}
