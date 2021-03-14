package com.sda.onlinestore.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="comanda")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comandaId;

    private Integer totalCost;
    private Integer dateOfOrder;
    private String costumer;
    private String status;

    @OneToOne
    private AddressEntity deliveryAdress;

    @OneToOne
    private UserAccountEntity userAccount;

    @OneToMany
    private List<OrderLineEntity> orderLines;

    public Integer getComandaId() {
        return comandaId;
    }

    public void setComandaId(Integer comandaId) {
        this.comandaId = comandaId;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Integer dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AddressEntity getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(AddressEntity deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public UserAccountEntity getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccountEntity userAccount) {
        this.userAccount = userAccount;
    }

    public List<OrderLineEntity> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLineEntity> orderLines) {
        this.orderLines = orderLines;
    }
}
