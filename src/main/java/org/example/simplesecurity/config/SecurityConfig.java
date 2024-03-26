package org.example.simplesecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


  @Bean
  public UserDetailsService userDetailUsers() {
    UserDetails userDetails = User.withDefaultPasswordEncoder()
        .username("user")
        .password("pass")
        .roles("USER")
        .build();
    return new InMemoryUserDetailsManager(userDetails);
  }

}
