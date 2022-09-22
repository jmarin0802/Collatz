package javi.dev.tools.service.Impl;

import javi.dev.tools.model.Mensaje;
import javi.dev.tools.model.MensajeAdmin;
import javi.dev.tools.model.MensajePublico;
import javi.dev.tools.service.ContenidoService;
import org.springframework.stereotype.Service;

@Service
public class ContenidoServiceImpl implements ContenidoService {

    private Mensaje contenido;
    private MensajeAdmin contenidoAdmin;
    private MensajePublico mensajePublico;

    public ContenidoServiceImpl(Mensaje contenido, MensajeAdmin mensajeAdmin, MensajePublico mensajePublico) {
        this.contenido = contenido;
        this.contenidoAdmin = mensajeAdmin;
        this.mensajePublico = mensajePublico;
    }

    @Override
    public Mensaje getContenido() {
        return this.contenido;
    }

    @Override
    public Object getContenidoAdmin() {
        return this.contenidoAdmin;
    }

    @Override
    public Object getContenidoPublico() {
        return this.mensajePublico;
    }
}
