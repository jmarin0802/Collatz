package javi.dev.tools.config;

import javi.dev.tools.model.Mensaje;
import javi.dev.tools.model.MensajeAdmin;
import javi.dev.tools.model.MensajePublico;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceBeans {

    @Bean
    public Mensaje contenidoBean(){
        return new Mensaje("Hola Venezuela");
    }

    @Bean
    public MensajeAdmin contenidoBeanAdmin(){
        return new MensajeAdmin("Hola Admin");
    }

    @Bean
    public MensajePublico contenidoBeanPublico(){
        return new MensajePublico("Hola Mundo");
    }
}
