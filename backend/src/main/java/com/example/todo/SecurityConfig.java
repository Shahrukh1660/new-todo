package com.example.todo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/**").permitAll()  // Allow API access
                .anyRequest().authenticated()
            )
            .formLogin(form -> form.disable())          // Disable form login
            .httpBasic(basic -> basic.disable());        // Disable HTTP Basic auth

        return http.build();
    }
}
