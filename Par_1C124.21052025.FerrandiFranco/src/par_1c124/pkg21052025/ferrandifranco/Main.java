/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_1c124.pkg21052025.ferrandifranco;

import java.util.Scanner;

/**
 *
 * @author el_fr
 */
public class Main {

    public static void main(String[] args) {
        AgenciaEspacial agencia = new AgenciaEspacial();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU Gestion de Naves ===");
            System.out.println("1. Agregar nave");
            System.out.println("2. Mostrar naves");
            System.out.println("3. Iniciar exploracion");
            System.out.println("4. Ordenar por nombre");
            System.out.println("5. Ordenar por anio");
            System.out.println("6. Ordenar por tripulacion");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Tipo de nave:(1: Exploracion, 2: Carguero, 3: Crucero): ");

                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine().trim();
                    if (nombre.isEmpty()) {
                        System.out.println("Nombre invalido. No puede estar vacio.");
                        break;
                    }

                    System.out.print("Capacidad tripulacion: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Ingrese un numero valido: ");
                        scanner.next();
                    }
                    int captrip = scanner.nextInt();

                    System.out.print("Año lanzamiento: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Ingrese anio valido: ");
                        scanner.next();
                    }
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    if (anio <= 0 || captrip <= 0) {
                        System.out.println("Datos invalidos (anio o capacidad de tripulacion).");
                    }

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Tipo de mision (CARTOGRAFIA, INVESTIGACION, CONTACTO): ");
                            String m = scanner.nextLine().toUpperCase();

                            boolean misionValida = false;
                            for (TipoMision tm : TipoMision.values()) {
                                if (tm.name().equals(m)) {
                                    agencia.agregarNave(new NaveExploracion(tm, nombre, captrip, anio));
                                    misionValida = true;
                                    break;
                                }
                            }

                            if (!misionValida) {
                                System.out.println("Tipo de mision invalido.");
                            }
                            
                        }
                        case 2 -> {System.out.print("Capacidad de carga (100-500): ");
                            while (!scanner.hasNextInt()) {
                                System.out.print("Ingrese un numero valido: ");
                                scanner.next();
                            }
                            int carga = scanner.nextInt();
                            if (carga < 100 || carga > 500) {
                                System.out.println("Capacidad de carga fuera de rango.");
                            } else {
                                agencia.agregarNave(new Carguero(captrip, nombre, carga, anio));
                            }

                        }
                        case 3 -> {
                            System.out.println("Cantidad de pasajeros: ");
                        }
                        default -> {
                            System.out.println("Tipo invalido.");
                            while (!scanner.hasNextInt()) {
                                System.out.print("Ingrese un numero valido: ");
                                scanner.next();
                            }
                            int pasajeros = scanner.nextInt();
                            if (pasajeros < 0) {
                                System.out.println("Cantidad de pasajeros.");
                            } else {
                                agencia.agregarNave(new Carguero(captrip, nombre, pasajeros, anio));
                            }
                        }
                    }

                }

                case 2 -> {
                    agencia.mostrarNaves();
                }
                case 3 -> {
                    agencia.inciarExploracion();
                }
                case 4 -> {
                    agencia.ordernarPorNombre();
                }
                case 5 -> {
                    agencia.ordenarPorAnio();
                }
                case 6 -> {
                    agencia.ordenarPorTripulacion();
                }
                case 7 -> {
                    System.out.println("Saliendo del sistema.");
                }
                default -> {
                    System.out.println("Opcion invalida. Vuelva a intentarlo.");
                }
            }

        } while (opcion != 7);

        scanner.close();
    }
}
