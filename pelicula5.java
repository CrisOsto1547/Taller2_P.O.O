package pelicula2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author estuam
 */
public class pelicula5 {

    public static void main(String[] args) {

        pelicula3 pista = new pelicula3();

        pista.titulo = "Titanic";
        pista.genero = "Drama";
        pista.autor = "Christopher Nolan";
        pista.duracion = 3.33;

        pista.mostrarinformacion();
        pista.reproducir();

        System.out.println();

        pelicula3 pista2 = new pelicula3();

        pista2.titulo = "Avatar";
        pista2.genero = "Ciencia ficcion";
        pista2.autor = "James Cameron";
        pista2.duracion = 2.42;

        pista2.mostrarinformacion();
        pista2.reproducir();
    }
}



