
package sistemagestióntransporteturístico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Natu
 */
public class Main {

    
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {

        int opcion;
        do {
            mostrarMenu();
            
            //Validamos que ingrese un numero
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número válido: ");
                scanner.next();
            }

            opcion = scanner.nextInt();
            scanner.nextLine(); //Para limpiar

            switch (opcion) {
                case 1: agregarVehiculo(); 
                        break;                
                //case 2: plataforma.listarFlota(); break;
               // case 3: alquilarVehiculo(); break;
                //case 4: finalizarAlquiler(); break;
                //case 5: enviarACarga(); break;
               // case 6: enviarAMantenimiento(); break;
               // case 7: plataforma.listarVehiculosQueNecesitanCarga(); break;
                case 8: System.out.println("¡Hasta luego!"); break;
                default: System.out.println("Opción inválida.");
            }

        } while (opcion != 8);

        scanner.close();
    }
    
    static void mostrarMenu() {
        System.out.println("----- MENU DE VEHICULOS -----");
        System.out.println(" 1. Agregar vehiculo");
        System.out.println(" 2. Mostrar todos los vehículos");
        System.out.println(" 3. Realizar servicios turísticos");
        System.out.println(" 4. Buscar vehículo por patente");
        System.out.println(" 5. Mostrar vehículos con capacidad mayor a un valor ingresado");
        System.out.println(" 6. Mostrar vehículos ordenados por año de fabricación descendente");
        System.out.println(" 7. Mostrar vehículos ordenados por capacidad de pasajeros descendente");
        System.out.println(" 8. Salir");
        System.out.println("========================================");
    }
        
    static void agregarVehiculo(){    
        
        System.out.println("Elija que tipo de vehiculo quiere agregar: ");
        System.out.println("Elija que tipo de vehiculo quiere agregar: ");
        
    }
    
}
