/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estuam
 */
package Taller2;
/**
 *
 *este espacio del documento representa el ejercicio 2, este declara las variables titulo, artista y duracion, 
 * al ejecutarse las pide y finalmente las muestra en pantalla
 */
/** ... */

//Inicia la clase y la hace publica//

    public class cancion {
        public String titulo;
        public String artista;
        public double duracion; 
        
        //muestra la informacion ingresada//
        
        public void mostrarInformacion(){
            System.out.println("el artista es: " + this.artista + "el titulo es: " + this.titulo + "tiene una duracion de: " + this.duracion);
        }
        //Reproduce la cancion//
        public void reproducir(){
            System.out.println("Reproduciendo... "+ titulo);
         
        }
    }