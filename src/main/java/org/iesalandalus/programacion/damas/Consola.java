package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;


public class Consola {

    private Consola() {
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
    public static int elegirOpcionMenu()
    {
        int opcion = -1;

        do {
            System.out.print("Elija una opción (1-4): ");
            opcion = Entrada.entero();
            if (opcion >= 1 && opcion <= 4) {
                return opcion;
            } else {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion < 1 && opcion > 4);
        return opcion;
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

    // Método para mostrar el menú de direcciones
    public static void mostrarMenuDirecciones() {
        System.out.println("Direcciones posibles:");
        System.out.println("1. NORESTE");
        System.out.println("2. SURESTE");
        System.out.println("3. SUROESTE");
        System.out.println("4. NOROESTE");
    }

    // Método para elegir la dirección
    public static Direccion elegirDireccion()
    {

        Direccion direccion = null;
        int opcion;
        while (direccion == null) {
            do {
                System.out.print("Elija la dirección: ");
                opcion = Entrada.entero();
                if (opcion >= 1 && opcion <= 4) {
                    switch (opcion) {
                        case 1:
                            direccion = Direccion.NORESTE;
                            break;
                        case 2:
                            direccion = Direccion.SURESTE;
                            break;
                        case 3:
                            direccion = Direccion.SUROESTE;
                            break;
                        case 4:
                            direccion = Direccion.NOROESTE;
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtelo de nuevo.");
                    }
                }
                return direccion;

            } while (opcion < 1 && opcion > 4);

        }
        return direccion;
    }

// Método para elegir el número de pasos
    public static int elegirPasos()
    {
        int pasos = 0;

        do
        {
            System.out.print("Introduzca el número de casillas a mover (mayor o igual que 1): ");

            pasos = Entrada.entero();
            if (pasos < 1) {
                System.out.println("El número de pasos debe ser al menos 1.");
            }

        }while(pasos<1);

        return pasos;


    }

    // Método de despedida
    public static void despedirse() {
        System.out.println("¡Gracias por usar la aplicación! Hasta pronto.");
    }























}
