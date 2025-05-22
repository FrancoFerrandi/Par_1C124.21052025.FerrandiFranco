/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c124.pkg21052025.ferrandifranco;

/**
 * Le cambio el nombre de Exploracion a Nave exploracion para diferenciarlo de la interfaz
 * @author el_fr
 */

public class NaveExploracion extends Nave implements Explorable{
    private TipoMision tipoMision;

    public NaveExploracion(TipoMision tipoMision, String nombre, int capacidadTripulacion, int anioLazamiento) {
        super(nombre, capacidadTripulacion, anioLazamiento);
        this.tipoMision = tipoMision;
    }

   @Override
   public boolean esExplorable(){
       return true;
   }
   
   @Override
    public String toString() { 
        return super.toString() + ", Mision: " + tipoMision;
    }
    
}
