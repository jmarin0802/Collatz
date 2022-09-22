package javi.dev.tools.service.Impl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Map;

public class UsuarioDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Map<String, String> usuarios = null;
        usuarios.put("sovalles","USER");
        usuarios.put("jmarin","ADMIN");
        Object rol = usuarios.get(username);
        if(rol !=null){
            User.UserBuilder userBuilder = User.withUsername(username);

        }
        return null;
    }
}
