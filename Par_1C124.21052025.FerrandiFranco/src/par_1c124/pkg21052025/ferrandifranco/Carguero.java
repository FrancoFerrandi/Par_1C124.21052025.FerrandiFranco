/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c124.pkg21052025.ferrandifranco;

/**
 *
 * @author el_fr
 */
public class Carguero extends Nave implements Explorable {

    private int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, int anioLazamiento) {
        super(nombre, capacidadTripulacion, anioLazamiento);

        if (capacidadCarga < 100) {
            this.capacidadCarga = 100;
        } else if (capacidadCarga > 500) {
            this.capacidadCarga = 500;
        } else {
            this.capacidadCarga = capacidadCarga;
        }
   }
   @Override
   public boolean esExplorable(){
       return true;
}
    @Override
    public String toString() { 
        return super.toString() + ", Capacidad de carga: " + capacidadCarga + " toneladas.";
    }

}
