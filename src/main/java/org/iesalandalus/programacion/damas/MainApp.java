package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Dama;

public class MainApp
{
    // Atributo de clase dama
    private static Dama dama;

    public static void main(String[] args){

    }
    // Método para ejecutar una opción del menú
    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearDamaDefecto();  // Crear dama por defecto
                break;
            case 2:
                crearDamaColor();  // Crear dama con color elegido
                break;
            case 3:
                mover();  // Mover la dama
                break;
            case 4:
                Consola.despedirse();  // Despedida y salir
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    // Método para crear una dama por defecto
    public static void crearDamaDefecto() {
        dama = new Dama();  // Crear dama blanca en una posición aleatoria
        System.out.println("Dama creada por defecto: " + dama);
    }









}
