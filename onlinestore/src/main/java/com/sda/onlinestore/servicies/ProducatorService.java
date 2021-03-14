package com.sda.onlinestore.servicies;

import com.sda.onlinestore.entities.ProducatorEntity;
import com.sda.onlinestore.repositories.ProducatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducatorService {
    @Autowired
    private ProducatorRepository producatorRepository;

    public void getProducator(ProducatorEntity newProducator) {
        this.producatorRepository = producatorRepository;
    }

    public void addProducator(ProducatorEntity newProducator) {
        producatorRepository.save(newProducator);
    }

    public List<ProducatorEntity> producatorList() {
       return producatorRepository.findAll();
    }

    public void getProducatorById(Integer id) {
        producatorRepository.findById(id);
    }

    public void deleteProducatorById(Integer id) {
        producatorRepository.deleteById(id);
    }

    public void editProducator(ProducatorEntity editedProducator) {
        producatorRepository.save(editedProducator);
    }
}
