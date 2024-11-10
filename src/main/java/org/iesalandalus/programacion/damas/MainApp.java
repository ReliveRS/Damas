package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Dama;
import org.iesalandalus.programacion.damas.modelo.Direccion;

import javax.naming.OperationNotSupportedException;

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
    // Método para crear una dama eligiendo el color
    public static void crearDamaColor() {
        Color color = Consola.elegirOpcion();  // Elegir color de la dama
        dama = new Dama(color);  // Crear dama con color
        System.out.println("Dama creada con color: " + dama);
    }

//Metodo para mover la dama
    private static void mover()
    {
        if (dama != null)
        {
            Consola.mostrarMenuDirecciones();
            Direccion direccion = Consola.elegirDireccion();
            int pasos = 1;

            // Si la dama es especial, preguntar por el número de casillas
            if (dama.esDamaEspecial())
            {
                pasos = Consola.elegirPasos();
            }

            // Intentar mover la dama y capturar posibles excepciones

            try
            {
                dama.mover(direccion, pasos);
                System.out.println("Dama movida a la nueva posición: " + dama);
            } catch (OperationNotSupportedException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        } else
        {
            System.out.println("Primero debe crear una dama para poder moverla.");
        }
    }












}
