/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.Serializable;
/**
 *
 * @author T107
 */
public class Imagencita implements Serializable{
    private String titulo;
    private String url;
    private String descripcion;

    public Imagencita() {
    }

    public Imagencita(String titulo, String url, String descripcion) {
        this.titulo = titulo;
        this.url = url;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Imagencita{" + "titulo=" + titulo + ", url=" + url + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
