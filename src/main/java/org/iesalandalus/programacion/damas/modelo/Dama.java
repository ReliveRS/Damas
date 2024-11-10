package org.iesalandalus.programacion.damas.modelo;

import javax.naming.OperationNotSupportedException;

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
        esDamaEspecial = false;  // No es dama especial inicialmente
    }

// Constructor con color especificado
    public Dama(Color color) {
        this.color = color;
        this.posicion = crearPosicionInicial(color);  // Posición inicial basada en el color
        esDamaEspecial = false;  // No es dama especial inicialmente
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


// Método para mover la dama
public void mover(Direccion direccion, int pasos) throws IllegalArgumentException, OperationNotSupportedException {
    // Validación de dirección nula
    if (direccion == null) {
        throw new IllegalArgumentException("La dirección no puede ser nula.");
    }

    // Si la dama no es especial, solo puede avanzar, no retroceder
    if (!esDamaEspecial) {
        if ((color == Color.BLANCO && (direccion == Direccion.SUROESTE || direccion == Direccion.SURESTE)) ||
                (color == Color.NEGRO && (direccion == Direccion.NORESTE || direccion == Direccion.NOROESTE))) {
            throw new OperationNotSupportedException("No se puede mover en esa dirección si no es una dama especial.");
        }

        pasos = 1;  // Si no es dama especial, solo puede moverse 1 casilla
    }

    // Verificación de que el número de pasos es válido
    if (pasos < 1) {
        throw new IllegalArgumentException("El número de pasos debe ser mayor o igual que 1.");
    }

    // Mover la dama según la dirección
    int nuevaFila = posicion.getFila();
    char nuevaColumna = posicion.getColumna();

    switch (direccion) {
        case NORESTE:
            nuevaFila += pasos;
            nuevaColumna += pasos;
            break;
        case SURESTE:
            nuevaFila -= pasos;
            nuevaColumna += pasos;
            break;
        case SUROESTE:
            nuevaFila -= pasos;
            nuevaColumna -= pasos;
            break;
        case NOROESTE:
            nuevaFila += pasos;
            nuevaColumna -= pasos;
            break;
        default:
            throw new OperationNotSupportedException("Dirección no válida.");
    }

    // Verificación de límites del tablero (1-8 para filas y 'a'-'h' para columnas)
    if (nuevaFila < 1 || nuevaFila > 8 || nuevaColumna < 'a' || nuevaColumna > 'h') {
        throw new OperationNotSupportedException("Movimiento fuera de los límites del tablero.");
    }

    // Actualizar la posición
    posicion.setFila(nuevaFila);
    posicion.setColumna(nuevaColumna);

    // Comprobar si la dama ha llegado al extremo y convertirse en dama especial
    if ((color == Color.BLANCO && nuevaFila == 8) || (color == Color.NEGRO && nuevaFila == 1)) {
        esDamaEspecial = true;
    }
}

    // Método toString que devuelve la representación en cadena del objeto Dama
    @Override
    public String toString() {
        return "Dama{" +
                "color=" + color +
                ", posicion=" + posicion +
                ", esDamaEspecial=" + esDamaEspecial +
                '}';
    }


    public boolean esDamaEspecial() {
    }
}
