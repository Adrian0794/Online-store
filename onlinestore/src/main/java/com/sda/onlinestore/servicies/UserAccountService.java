package com.sda.onlinestore.servicies;

import com.sda.onlinestore.entities.AddressEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.repositories.AddressRepository;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserAccountService implements UserDetailsService {
    @Autowired
    private UserAccountRepository userAccountRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //Implementarea
        Optional<UserAccountEntity> userOptional = userAccountRepository.findByUsername(s);
        if (userOptional.isPresent()) {
            UserAccountEntity userAccountEntity1 = userOptional.get();

            String username = userAccountEntity1.getUsername();
            String password = userAccountEntity1.getPassword();
            List<GrantedAuthority> listadeRoluri = Arrays.asList(new SimpleGrantedAuthority(userAccountEntity1.getRole()));
            UserDetails userDetails = new User(username, password, listadeRoluri);
            return userDetails;
        }
        throw new UsernameNotFoundException("User not found!");
    }

    public void editUser(UserAccountEntity editedUser) {
        userAccountRepository.save(editedUser);
    }

    public void addCustomer(UserAccountEntity user) {
        user.setRole("ROLE_CUSTOMER");
        String password = user.getPassword();
        String encodedPassword = passwordEncoder.encode(password);
        user.setPassword(encodedPassword);
        userAccountRepository.save(user);
    }
}
