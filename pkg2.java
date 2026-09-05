package Taller2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author estuam
 */

public class pkg2 {

    public static void main(String[] args) {

        // Primera canción
        cancion pista = new cancion();

        pista.titulo = "Velitas";
        pista.duracion = 3.44;
        pista.artista = "Brytiago";

        // Segunda canción
        cancion pista2 = new cancion();

        pista2.titulo = "LALA";
        pista2.duracion = 3.17;
        pista2.artista = "Myke Towers";

        // Mostrar información de la primera canción
        pista.mostrarInformacion();
        pista.reproducir();

        System.out.println();

        // Mostrar información de la segunda canción
        pista2.mostrarInformacion();
        pista2.reproducir();
    }
}

