package javi.dev.tools.config;

import javi.dev.tools.service.Impl.UsuarioDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UsuarioDetailsServiceImpl usuarioDetailsService;

    protected void configure(HttpSecurity http) throws Exception{
        http.httpBasic(Customizer.withDefaults())
                .authorizeRequests()
                .antMatchers("/carta/publico/**").permitAll()
                .antMatchers("/carta/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(usuarioDetailsService);
        /*auth.inMemoryAuthentication()
                .withUser("sovalles").password("{noop}"+"secreto").roles("USER")
                .and()
                .withUser("jmarin").password("{noop}"+"secreto").roles("admin");

    */
    }

}
