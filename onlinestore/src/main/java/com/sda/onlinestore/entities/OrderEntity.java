package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name ="comanda")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer comandaId;
    public String userName;
    public double totalCost;
    public String deliveryAdress;
    public String userAdress;
    public double dateOfOrder;
    public Integer orderLines;
    public String costumer;
    public String status;

    public Integer getOrderId() {
        return comandaId;
    }

    public void setOrderId(Integer orderId) {
        this.comandaId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public double getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(double dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Integer getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Integer orderLines) {
        this.orderLines = orderLines;
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
}
