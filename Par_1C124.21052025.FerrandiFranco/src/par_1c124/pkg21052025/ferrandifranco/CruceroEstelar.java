/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c124.pkg21052025.ferrandifranco;

/**
 *
 * @author el_fr
 */
public class CruceroEstelar extends Nave{
    private int cantidadPasajeros;

    public CruceroEstelar(int cantidadPasajeros, String nombre, int capacidadTripulacion, int anioLazamiento) {
        super(nombre, capacidadTripulacion, anioLazamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    @Override
    public String toString() { 
        return super.toString() + ", Cantidad de passajeros: " + cantidadPasajeros;
    }
}
