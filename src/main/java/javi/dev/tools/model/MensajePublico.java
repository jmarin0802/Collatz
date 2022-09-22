package javi.dev.tools.model;

public class MensajePublico {
    private String contenido;

    public MensajePublico(String mensaje) {
        this.contenido = mensaje;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
