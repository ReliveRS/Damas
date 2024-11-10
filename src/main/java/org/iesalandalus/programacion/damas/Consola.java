package org.iesalandalus.programacion.damas;

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






}
