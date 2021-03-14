package com.sda.onlinestore.repositories;

import com.sda.onlinestore.entities.ProducatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducatorRepository extends JpaRepository<ProducatorEntity, Integer> {
}
