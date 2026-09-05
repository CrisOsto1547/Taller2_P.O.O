/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package pelicula2;

/**
 * Representa una película con su título, género, autor y duración.
 */
public class pelicula3 {

    public String titulo;
    public String genero;
    public double duracion;
    public String autor;

    /**
     * Muestra la información de la película.
     */
    public void mostrarinformacion() {
        System.out.println("titulo: " + titulo
                + " genero: " + genero
                + " autor: " + autor
                + " duracion: " + duracion);
    }

    /**
     * Reproduce la película.
     */
    public void reproducir() {
        System.out.println("titulo: " + titulo);
    }
}