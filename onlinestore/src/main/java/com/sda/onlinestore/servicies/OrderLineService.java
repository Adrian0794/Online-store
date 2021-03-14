package com.sda.onlinestore.servicies;

import com.sda.onlinestore.entities.OrderLineEntity;
import com.sda.onlinestore.entities.ProducatorEntity;
import com.sda.onlinestore.repositories.OrderLineRepository;
import com.sda.onlinestore.repositories.ProducatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineService {

    @Autowired
    private OrderLineRepository orderLineRepository;

    public void getOrderLine(OrderLineEntity newOrderLine) {
        this.orderLineRepository = orderLineRepository;
    }

    public void addOrderLine(OrderLineEntity newOrderLine) {
        orderLineRepository.save(newOrderLine);
    }

    public List<OrderLineEntity> orderLineList() {
        return orderLineRepository.findAll();
    }

    public void getOrderLineById(Integer id) {
        orderLineRepository.findById(id);
    }

    public void deleteOrderLineById(Integer id) {
        orderLineRepository.deleteById(id);
    }

    public void editOrderline(OrderLineEntity editOrderLine) {
        orderLineRepository.save(editOrderLine);
    }
}
