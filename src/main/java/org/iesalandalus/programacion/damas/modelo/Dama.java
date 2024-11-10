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















}
