package com.sda.onlinestore.config;

import com.sda.onlinestore.servicies.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserAccountService userAccountService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        vom defini regulile de securitate in aplicatia noastra
        http.authorizeRequests().antMatchers("/login", "/register/**", "/register").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(createDaoAuthentication());
    }

    @Bean
    public DaoAuthenticationProvider createDaoAuthentication() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userAccountService);
        daoAuthenticationProvider.setPasswordEncoder(createEncoder());
        return daoAuthenticationProvider;
    }

    @Bean
    public BCryptPasswordEncoder createEncoder() {
        return new BCryptPasswordEncoder();
    }

}
