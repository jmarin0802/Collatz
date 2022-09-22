package javi.dev.tools.service;

import javi.dev.tools.model.Mensaje;

public interface ContenidoService {
    Mensaje getContenido();

    Object getContenidoAdmin();

    Object getContenidoPublico();
}
