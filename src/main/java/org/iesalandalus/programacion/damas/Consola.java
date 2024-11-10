package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

import java.util.Scanner;


public class Consola {

    private Consola(){
        throw new UnsupportedOperationException("Esta clase no puede ser instanciada.");
    }
// Método para mostrar el menú principal
    public static void mostrarMenu() {
        System.out.println("Menú de Opciones:");
        System.out.println("1. Crear dama por defecto");
        System.out.println("2. Crear dama eligiendo el color");
        System.out.println("3. Mover");
        System.out.println("4. Salir");
    }

    // Método para elegir una opción del menú principal
    public static int elegirOpcionMenu() {

        int opcion;

        do{
            System.out.print("Elija una opción (1-4): ");
            opcion =  Entrada.entero();
            if (opcion >= 1 && opcion <= 4) {
                return opcion;
            } else {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }while(opcion<1 && opcion >4)

    }

// Método para elegir el color de la dama
    public static Color elegirOpcion() {

        Color color = null;

        while (color == null) {
            System.out.print("Elija el color de la dama (BLANCO o NEGRO): ");
            String opcion = Entrada.cadena();
            switch (opcion) {
                case "BLANCO":
                    color = Color.BLANCO;
                    break;
                case "NEGRO":
                    color = Color.NEGRO;
                    break;
                default:
                    System.out.println("Opción inválida, por favor elija entre 'BLANCO' o 'NEGRO'.");
            }
        }
        return color;
    }











}
