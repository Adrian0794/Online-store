package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name="producator")
public class ProducatorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer producatorId;
    private String firstName;
    private String lastName;

    public Integer getProducatorId() {
        return producatorId;
    }

    public void setProducatorId(Integer producatorId) {
        this.producatorId = producatorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
