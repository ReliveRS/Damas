package org.iesalandalus.programacion.damas.modelo;

public class Posicion {

    private int fila;  // Fila (de 1 a 8)
    private char columna;  // Columna (de 'a' a 'h')

    // Métodos getter y setter para 'fila'
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila < 1 || fila > 8) {
            throw new IllegalArgumentException("La fila debe estar entre 1 y 8.");
        }
        this.fila = fila;
    }

    // Métodos getter y setter para 'columna'
    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna < 'a' || columna > 'h') {
            throw new IllegalArgumentException("La columna debe estar entre 'a' y 'h'.");
        }
        this.columna = columna;
    }

    // Constructor con parámetros fila y columna
    public Posicion(int fila, char columna) {
        setFila(fila);  // Llama al setter de fila
        setColumna(columna);  // Llama al setter de columna
    }
    /**
     * Constructor de copia.
     * Copia los valores de la posicion como parámetro en un nuevo objeto c.
    */
    public Posicion(Posicion c)
    {
        //Comprobamos que el objeto pasado como parámetro no es nulo
        if (c==null)
            throw new NullPointerException("ERROR: Has pasado una posicion nula como parámetro");

        setFila(c.getFila());
        setColumna(c.getColumna());

    }

    // Métodos equals y hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Posicion posicion = (Posicion) obj;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return 31 * fila + columna;
    }
    // Método toString
    @Override
    public String toString() {
        return "fila=" + fila + ", columna=" + columna;
    }




}
