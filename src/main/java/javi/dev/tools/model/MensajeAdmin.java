package javi.dev.tools.model;

public class MensajeAdmin {
    private String contenido;

    public MensajeAdmin(String mensaje) {
        this.contenido = mensaje;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
