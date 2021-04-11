package com.sda.onlinestore.servicies;

import ch.qos.logback.core.status.Status;
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

//    public void addToCart( Integer userId, Integer productId){
//
//        OrderEntity orderEntity = new OrderEntity();
//        Optional<UserAccountEntity> userBox = userAccountRepository.findById(userId);
//        UserAccountEntity userAccountEntity = userBox.get();
//        orderEntity.setUserAccount(userAccountEntity);
//
//        OrderLineEntity orderLineEntity = new OrderLineEntity();
//        orderLineEntity.setQuantityOfProducts(1);
//        Optional<ProductEntity> productOptional = productRepository.findById(productId);
//        ProductEntity productEntity = productOptional.get();
//        orderLineEntity.setProduct(productEntity);
//        orderLineEntity.setProductPrice(orderLineEntity.getQuantityOfProducts() * productEntity.getPrice());
//
//        List<OrderLineEntity> orderLineEntityList = new ArrayList<>();
//        orderLineEntityList.add(orderLineEntity);
//        orderEntity.setOrderLines(orderLineEntityList);
//        orderEntity.setType(OrderEntity.Status.HOLD);
//    }
public Double totalPrice(List<OrderLineEntity> orderLineModel) {
    Double total = 0.0;
    for (OrderLineEntity olm : orderLineModel) {
        total = total + olm.getProduct().getPrice() * olm.getQuantityOfProducts();
    }
    return total;
}
    public void addToCart(String userAccount, Integer productID) {
        Optional<OrderEntity> orderModelOptional = orderRepository.findOrderModelByUserAccountAndStatus(userAccount, OrderEntity.Status.HOLD);
        UserAccountEntity userModel = userAccountRepository.findByUsername(userAccount).orElse(null);
        OrderEntity order;
        boolean isAlreadyInBasket = false;
        if (orderModelOptional.isPresent()) {
            order = orderModelOptional.get();
            List<OrderLineEntity> orderLineModels = order.getOrderLines();
            for (OrderLineEntity olm : orderLineModels) {
                if (olm.getProduct().getProductId() == productID) {
                    olm.setQuantityOfProducts(olm.getQuantityOfProducts() + 1);
                    olm.setProductPrice(olm.getQuantityOfProducts() * olm.getProduct().getPrice());
                    isAlreadyInBasket = true;
                }
            }
            if (!isAlreadyInBasket) {
                OrderLineEntity orderLineModel = new OrderLineEntity();
                orderLineModel.setQuantityOfProducts(1);
                orderLineModel.setProduct(productRepository.findById(productID).orElse(null));
                orderLineModel.setTotalPriceOrder((orderLineModel.getQuantityOfProducts() * orderLineModel.getProduct().getPrice()));
                order.getOrderLines().add(orderLineModel);
                order.setTotalCost(totalPrice(order.getOrderLines()));
                orderRepository.save(order);
            }
            order.setDeliveryAdress(userModel.getAddress());
            order.setTotalCost(totalPrice(order.getOrderLines()));
            orderRepository.save(order);
        } else {
            order = new OrderEntity();
            order.setType(OrderEntity.Status.HOLD);
            order.setUserAccount(userModel);
            order.setDeliveryAdress(userModel.getAddress());
            OrderLineEntity orderLineModel = new OrderLineEntity();
            orderLineModel.setQuantityOfProducts(1);
            orderLineModel.setProduct(productRepository.findById(productID).orElse(null));
            orderLineModel.setTotalPriceOrder(orderLineModel.getQuantityOfProducts() * orderLineModel.getProduct().getPrice());
            order.getOrderLines().add(orderLineModel);
            order.setTotalCost(totalPrice(order.getOrderLines()));
            orderRepository.save(order);
        }
    }

}
