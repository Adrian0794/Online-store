package com.sda.onlinestore.servicies;


import com.sda.onlinestore.entities.OrderEntity;
import com.sda.onlinestore.repositories.OrderRepository;
import com.sda.onlinestore.repositories.ProductRepository;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Autowired
    private ProductRepository productRepository;



    public void getOrder( OrderEntity newOrder){
        this.orderRepository = orderRepository;
    }

    public void addOrder( OrderEntity newOrder){
        this.orderRepository.save(newOrder);
    }

    public void getOderById( Integer id){
        this.orderRepository.findById(id);
    }

    public void deleteOrder(Integer id){
        orderRepository.deleteById(id);
    }

    public void editOrder(OrderEntity editOrder){
    orderRepository.save(editOrder);
    }

    public List<OrderEntity> getAllOrders(){
        return getAllOrders();
    }

}
