package com.sda.onlinestore.repositories;


import com.sda.onlinestore.entities.OrderEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.lang.reflect.Type;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
//        public Optional<OrderEntity> findOrderModelByUserAccountAndStatus(String userAccount, OrderEntity.Status status);


}