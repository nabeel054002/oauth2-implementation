// package com.example.demo.config;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfiguration {

//     protected void configure(HttpSecurity http) throws Exception {
//         http
//             .authorizeHttpRequests(null).
//                 .requestMatchers("/oauth2/**", "/login/**", "/logout/**")
//                 .permitAll()
//                 .anyRequest()
//                 .authenticated()
//                 .and()
//             .oauth2Login()
//                 .loginPage("/login")
//                 .defaultSuccessUrl("/home")
//                 .and()
//             .logout()
//                 .logoutSuccessUrl("/")
//                 .logoutUrl("/logout")
//                 .and()
//             .csrf().disable();
//     }

// }