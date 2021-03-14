package com.sda.onlinestore.servicies;

import com.sda.onlinestore.entities.AddressEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.repositories.AddressRepository;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService {
    @Autowired
    private UserAccountRepository userAccountRepository;

    public void setUserRepository() {
        this.userAccountRepository = userAccountRepository;
    }

    public void addUser(UserAccountEntity newUser) {
        userAccountRepository.save(newUser);
    }

    public void deleteUserId(Integer id) {
        userAccountRepository.deleteById(id);
    }

    public List<UserAccountEntity> userAccountAllList() {
        return userAccountRepository.findAll();
    }

    public void editUser(UserAccountEntity editedUser){
       userAccountRepository.save(editedUser);
    }

}
