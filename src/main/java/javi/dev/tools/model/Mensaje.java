package javi.dev.tools.model;

public class Mensaje {
    private String contenido;

    public Mensaje(String mensaje) {
        this.contenido = mensaje;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
