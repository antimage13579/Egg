/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author H81M-E33
 */
public class EntidadLibro {
   
    public String isbn;
    public String titulo;
    public String autor;
    public int numero_de_pag;

    public EntidadLibro() {
   
    }

    public EntidadLibro(String isbn, String titulo, String autor, int numero_de_pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numero_de_pag = numero_de_pag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_de_pag() {
        return numero_de_pag;
    }

    public void setNumero_de_pag(int numero_de_pag) {
        this.numero_de_pag = numero_de_pag;
    }

    @Override
    public String toString() {
        return "EntidadLibro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numero_de_pag=" + numero_de_pag + '}';
    }
    
    
}
    