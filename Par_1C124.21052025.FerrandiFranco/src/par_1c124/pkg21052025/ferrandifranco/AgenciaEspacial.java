/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c124.pkg21052025.ferrandifranco;
import java.util.*;


/**
 *
 * @author el_fr
 */
public class AgenciaEspacial {
    private List <Nave> naves = new ArrayList<>();

    public void agregarNave(Nave nave) {
        if (naves.contains(nave)) { //CONTAINS USA EL METODO EQUALS, que en este caso mira titulo y año si son =
            System.out.println("Ya existe una nave con ese nombre y anio de lanzamiento.");
        } else {
            naves.add(nave);
            System.out.println("Nave agregada.");
        }
    }

    public void mostrarNaves() {
        System.out.println("Naves en la flota:");
        for (Nave nave : naves) {
            System.out.println(nave);
        }
    }
    
    public void inciarExploracion() {
        System.out.println("Lectura de publicaciones:");
        for (Nave nave : naves) {
            if (nave instanceof Explorable) {
                System.out.println("Inician exploracion: " + nave.getNombre());
            } else {
                System.out.println("La nave " + nave.getNombre() + " no puede explorar (Crucero).");
            }
        }
    }
    
    public void ordernarPorNombre(){
        Collections.sort(naves, new ComparadoresNombreAsc());
        mostrarNaves();
    }
    
    public void ordenarPorAnio(){
        Collections.sort(naves, new ComparadorAñoLazamientoDesc());
        mostrarNaves();
    }
    
     public void ordenarPorTripulacion(){
        Collections.sort(naves, new ComparadorTripulacionDesc());
        mostrarNaves();
    }
     
}
