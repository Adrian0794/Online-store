package com.sda.onlinestore.servicies;

import com.sda.onlinestore.entities.OrderEntity;
import com.sda.onlinestore.entities.OrderLineEntity;
import com.sda.onlinestore.entities.ProductEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.repositories.OrderRepository;
import com.sda.onlinestore.repositories.ProductRepository;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserAccountRepository accountRepository;

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

    public void addToCart( Integer userId, Integer productId){

        OrderEntity orderEntity = new OrderEntity();
        Optional<UserAccountEntity> userBox = accountRepository.findById(userId);
        UserAccountEntity userAccountEntity = userBox.get();
        orderEntity.setUserAccount(userAccountEntity);

        OrderLineEntity orderLineEntity = new OrderLineEntity();
        orderLineEntity.setQuantityOfProducts(1);
        Optional<ProductEntity> productOptional = productRepository.findById(productId);
        ProductEntity productEntity = productOptional.get();
        orderLineEntity.setProduct(productEntity);
        orderLineEntity.setProductPrice(orderLineEntity.getQuantityOfProducts() * productEntity.getPrice());

        List<OrderLineEntity> orderLineEntityList = new ArrayList<>();
        orderLineEntityList.add(orderLineEntity);
        orderEntity.setOrderLines(orderLineEntityList);
        orderEntity.setStatus("Open");
    }

}
