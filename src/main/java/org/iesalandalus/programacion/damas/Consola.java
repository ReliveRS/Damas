package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.utilidades.Entrada;



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




}
