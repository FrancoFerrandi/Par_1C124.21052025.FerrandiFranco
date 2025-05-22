/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c124.pkg21052025.ferrandifranco;

import java.util.Comparator;

/**
 *
 * @author el_fr
 */

public class ComparadorTripulacionDesc implements Comparator<Nave>{
    @Override
    public int compare(Nave p1, Nave p2) {
        return Integer.compare(p2.getCapacidadTripulacion(),p1.getCapacidadTripulacion());
    }

}