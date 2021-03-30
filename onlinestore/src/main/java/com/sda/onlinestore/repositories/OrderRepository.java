package com.sda.onlinestore.repositories;


import com.sda.onlinestore.entities.OrderEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import jdk.net.SocketFlow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

//        public Optional<OrderEntity> findOrderModelByUserNameAndStatus(String userName, SocketFlow.Status status);
//    }

}