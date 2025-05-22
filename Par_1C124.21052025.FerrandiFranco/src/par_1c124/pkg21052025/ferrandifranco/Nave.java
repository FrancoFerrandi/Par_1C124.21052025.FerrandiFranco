/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c124.pkg21052025.ferrandifranco;

/**
 *
 * @author el_fr
 */
public abstract class Nave implements Comparable<Nave>{

    protected String nombre;
    protected int capacidadTripulacion;
    protected int anioLazamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLazamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLazamiento = anioLazamiento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nave)) {
            return false;
        }
        Nave otra = (Nave) obj;
        return this.nombre.equalsIgnoreCase(otra.nombre) && this.anioLazamiento == otra.anioLazamiento; //dos publicaciones son iguales si tienen el mismo titulo y año de publicación)
    }

    @Override
    public int compareTo(Nave otra) {
        return Integer.compare(this.anioLazamiento, otra.anioLazamiento); // más antiguo primero
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre: " + nombre + ", capacidad de tripulacion: " + capacidadTripulacion + ", lanzamiento: " + anioLazamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public int getAnioLazamiento() {
        return anioLazamiento;
    }
    
    
}
