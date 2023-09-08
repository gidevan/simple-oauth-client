package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated())
                .oauth2Login(oauthLogin -> oauthLogin.loginPage("/oauth2/authorization/myoauth2"))
                .oauth2Client(Customizer.withDefaults())
                .build();
    }
}
