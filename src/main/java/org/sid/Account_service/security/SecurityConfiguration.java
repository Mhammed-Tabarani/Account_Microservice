package org.sid.Account_service.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors();
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests().antMatchers("/drivers/**").hasRole("DRIVER");
        http.authorizeRequests().antMatchers("/passenger/**").hasRole("DRIVER");
        http.authorizeRequests().antMatchers("/register/passengers","/register/drivers").permitAll();
        http.authorizeRequests().anyRequest().authenticated();
        http.addFilterBefore(new AuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
    }
}
