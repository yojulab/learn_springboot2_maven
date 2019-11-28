package com.example.learn_springboot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  public void configure(WebSecurity web) throws Exception {
    // String[] resources = new String[] { "/css/**", "/icons/**", "/images/**", "/js/**", "/fonts/**" };
    // web.ignoring().antMatchers(resources);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    String[] permitAllList = new String[] { "/", "/home", "/index"};
    http.authorizeRequests().antMatchers(permitAllList).permitAll().antMatchers("/api/**").authenticated().and()
        .formLogin();
  }
}