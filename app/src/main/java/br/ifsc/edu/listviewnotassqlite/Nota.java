package br.ifsc.edu.listviewnotassqlite;

public class Nota {

    String titulo;
    String texto;

    public Nota(String titulo, String texto) {

        this.titulo = titulo;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

}
