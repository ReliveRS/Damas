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







}
