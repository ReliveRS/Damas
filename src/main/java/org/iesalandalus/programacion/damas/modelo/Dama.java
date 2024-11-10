package org.iesalandalus.programacion.damas.modelo;

public class Dama {

//Atributos de la Clase Dama

    private Color color;
    private Posicion posicion;
    private static boolean esDamaEspecial;

//Metodos Getters y Setters

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("El color no puede ser nulo.");
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException("La posición no puede ser nula.");
        }
        this.posicion = posicion;
    }

    public static boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public static void setEsDamaEspecial(boolean esDamaEspecial) {
        Dama.esDamaEspecial = esDamaEspecial;
    }

// Constructor por defecto (dama blanca en posición aleatoria en las filas 1, 2, 3)
    public Dama() {
        this.color = Color.BLANCO;  // La dama será blanca por defecto
        this.posicion = crearPosicionInicial(color);  // Posición inicial aleatoria para la dama blanca
        this.esDamaEspecial = false;  // No es dama especial inicialmente
    }

// Constructor con color especificado
    public Dama(Color color) {
        this.color = color;
        this.posicion = crearPosicionInicial(color);  // Posición inicial basada en el color
        this.esDamaEspecial = false;  // No es dama especial inicialmente
    }

    // Método para crear una posición inicial aleatoria basada en el color de la dama
    private Posicion crearPosicionInicial(Color color) {
        int fila = 0;
        char columna;

        // Si la dama es blanca, la posición inicial debe ser en las filas 1, 2 o 3
        if (color == Color.BLANCO) {
            fila = (int) (Math.random() * 3) + 1;  // Aleatorio entre 1 y 3
        } else {  // Si la dama es negra, la posición inicial debe ser en las filas 6, 7 o 8
            fila = (int) (Math.random() * 3) + 6;  // Aleatorio entre 6 y 8
        }

        // La columna debe ser siempre una casilla negra (de 'a' a 'h')
        columna = (char) ('a' + (int) (Math.random() * 8));  // Aleatorio entre 'a' y 'h'

        return new Posicion(fila, columna);  // Retorna una nueva posición aleatoria
    }









}
